package Basket;

import java.util.Comparator;

public class ComparatorHouse implements Comparator<Box> {
    public int compare(Box b1, Box b2) {
        if (b1.getCommonWeight() == b2.getCommonWeight()) {
            return 0;
        } else if (b2.getCommonWeight() < b2.getCommonWeight()) {
            return -1;
        } else {
            return 1;
        }
    }
}
