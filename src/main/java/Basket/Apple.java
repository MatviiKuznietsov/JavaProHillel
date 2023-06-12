package Basket;

public class Apple extends Fruit {
    private final double weight = 1;

    public Apple() {
        super.setWeight(weight);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
