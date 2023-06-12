package Basket;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
//--------------------------------------------------
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        ArrayList<Orange> oranges = new ArrayList<>();
        oranges.add(orange1);
        oranges.add(orange2);
//--------------------------------------------------
        Box<Orange> box1 = new Box();
        box1.addOne(orange2);
        box1.addOne(orange1);
        box1.addSome(oranges);
        box1.addSome(oranges);
        box1.addSome(oranges);
        box1.seeInBox();
        box1.getWeight();

        Box<Apple> box2 = new Box();
        box2.addSome(apples);
        box2.seeInBox();
        box2.getWeight();
        box2.merge(box2);
        box2.seeInBox();
        box2.getWeight();
        box2.compare(box1);

        Box<Apple> box3 = new Box();
        box2.addSome(apples);
        box2.addSome(apples);
        box3.merge(box2);
        box3.seeInBox();
        box3.getWeight();
        box3.compare(box1);

        ArrayList<Box> boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);

        System.out.println(boxes);
    }
}
