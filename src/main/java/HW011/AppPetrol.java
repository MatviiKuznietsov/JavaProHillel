package HW011;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class AppPetrol {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3, true);

        Random random = new Random();
        PetrolStation petrolStation = new PetrolStation();
        petrolStation.setAmount(500);
        petrolStation.setQuantityRequest(5);

        Runnable getFuel = () -> {
            long timeStart = System.currentTimeMillis();
            try {
                semaphore.acquire();
                double fuel = petrolStation.doRefuel(100); //random.nextInt(1000)
                petrolStation.setStartAmount(fuel);
                System.out.println("\nit`s remain " + fuel + "l left ");


                long timeEnd = System.currentTimeMillis();
                System.out.println("Past time - " + (timeEnd - timeStart));
                if ((timeEnd - timeStart) < 3000 || (timeEnd - timeStart) > 10000) {
                    throw new TimeException();
                }
            } catch (TimeException e) {
                System.out.println("Time is over");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            semaphore.release();
        };

        for (int i = 0; i < petrolStation.getQuantityRequest(); i++) {
            Thread refueling = new Thread(getFuel);
            refueling.start();
        }
    }
}
