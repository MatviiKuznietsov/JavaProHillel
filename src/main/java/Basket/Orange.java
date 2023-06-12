package Basket;

public class Orange  extends Fruit{
    private final double weight = 1.5;

    Orange (){
        super.setWeight(weight);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }
}
