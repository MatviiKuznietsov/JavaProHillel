package ShakerSorting;

import java.util.Random;

public class shakeSorting {

    public int[] makeArray() {
        int arraySize = 10;
        int[] array = new int[arraySize];
        Random newRandom = new Random();

        for (int i = 0; i < array.length; i++) { //fillArray
            array[i] = newRandom.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public void sortArray(int array[]) {
        int temp;
        int leftSide = 0;
        int rightSide = array.length - 1;

        do {

            for (int i = leftSide; i < rightSide; i++) { // Сортир. влево ищем МАКС. знач.


                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            rightSide--;
            for (int i = rightSide; i > leftSide; i--) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            leftSide++;
        } while (leftSide < rightSide);

        for (int i : array
        ) {
            System.out.print(array[i] + " ");
        }
    }
}
