package HW25;

import java.util.ArrayList;
import java.util.List;

public class ArrayWork {
    public int[] arrayBackAfter4(int[] array) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                numbers.clear();
                for (int j = (i + 1); j < array.length; j++) {
                    numbers.add(array[j]);
                }
            }
        }
        int[] result = new int[numbers.size()];
        System.out.println(numbers);
        for (int i=0 ; i<numbers.size(); i++) {
        result[i]=numbers.get(i);
        }
        return result;
    }

    public boolean checkArrayWithout4or1(int[] array) {
        int countOne = 0;
        int countFour = 0;
        int countAnother = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                countOne++;
            } else if (array[i] == 4) {
                countFour++;
            } else {
                countAnother++;
            }
        }
        if (countAnother > 0 || countFour == 0 || countOne == 0) {
            return false;
        }
        return true;
    }
}
