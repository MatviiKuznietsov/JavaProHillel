package Builder;

public class App {
    public static void main(String[] args) {
        MyCar car1 = MyCar.getBuilder().setWheels(7).setFuel("diesel").setMileage(6515).build();
        MyCar car2 = MyCar.getBuilder().setMileage(612121212).build();
        System.out.println(car1);
        System.out.println(car2);
    }
}
