package Builder;

public class MyCar {
    private int wheels = 4;
    private int numberPlaces = 5;
    private String fuel = "diesel";
    private int mileage = 111111;
    private String transmission = "auto";

    @Override
    public String toString() {
        return "MyCar{" +
                "wheels=" + wheels +
                ", numberPlaces=" + numberPlaces +
                ", fuel='" + fuel + '\'' +
                ", mileage=" + mileage +
                ", transmission='" + transmission + '\'' +
                '}';
    }

    private MyCar() {
    }
    public static MyCarBuilder getBuilder() {
        return new MyCarBuilder();
    }
    public static class MyCarBuilder {  //class
        private MyCar client;

        public MyCarBuilder() {
            this.client = new MyCar();
        }

        public MyCarBuilder setWheels(int wheels) {
            this.client.wheels = wheels;
            return this;
        }

        public MyCarBuilder setNumberPlaces(int numberPlaces) {
            this.client.numberPlaces = numberPlaces;
            return this;
        }

        public MyCarBuilder setFuel(String fuel) {
            this.client.fuel = fuel;
            return this;
        }

        public MyCarBuilder setMileage(int mileage) {
            this.client.mileage = mileage;
            return this;
        }

        public MyCarBuilder setTransmission(String transmission) {
            this.client.transmission = transmission;
            return this;
        }
        public MyCar build() {
            return client;
        }
    }

}


