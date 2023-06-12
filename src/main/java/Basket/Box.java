package Basket;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private double commonWeight;
    List<Double> weightList = new ArrayList<>();

    List<T> fruits = new ArrayList<>();

    ArrayList<Box> boxes = new ArrayList<>();

    public double getCommonWeight() {
        return commonWeight;
    }

    public void setCommonWeight(double commonWeight) {
        this.commonWeight = commonWeight;
    }

    public void compare(Box box1) {
        ComparatorHouse comparatorHouse = new ComparatorHouse();
        int result = comparatorHouse.compare(box1, Box.this);
        if (result == 0) {
            System.out.println("Box equals");
        } else {
            System.out.println("Box isn`t equals");
        }
    }

    public void merge(Box<T> box) {
        fruits.addAll(box.fruits);
        weightList.addAll(box.weightList);
    }

    public void addOne(T fruit) {
        fruits.add(fruit);
        weightList.add(fruit.getWeight());
    }

    public void addSome(List<T> fruits) {
        for (Fruit fruit : fruits) {
            this.fruits.add((T) fruit);
            weightList.add(fruit.getWeight());
        }
    }

    public void getWeight() {
        double summ = 0;
        for (double weight : weightList) {
            summ = summ + weight;
        }
        setCommonWeight(summ);
        System.out.println("Weight = " + summ);
    }

    public void seeInBox() {
        for (Fruit fruit : fruits) {
            System.out.println("In box - " + fruit);
        }
    }

    @Override
    public String toString() {
        return "\nBox{" +
                "commonWeight=" + commonWeight +
                ", weightList=" + weightList +
                ", fruits=" + fruits +
                '}';
    }
}
