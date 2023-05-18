package HW011;

import java.util.Random;

public class AppList {
    public static void main(String[] args) throws InterruptedException {
        ThreadSafeList threadSafeList = new ThreadSafeList();
        Random random = new Random();

        Runnable addElements = () -> {
            threadSafeList.add(random);
        };
        Runnable getElements = () -> {
            threadSafeList.get(random);
        };
        Runnable removeElement = () -> {
            threadSafeList.remove(random);
        };

        Thread addThread = new Thread(addElements);
        addThread.start();

        Thread getThread = new Thread(getElements);
        getThread.start();

        Thread removeThread = new Thread(removeElement);
        removeThread.start();

    }
}
