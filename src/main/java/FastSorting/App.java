package FastSorting;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        fastSorting fastSorting = new fastSorting();
        int[] arrayForSorting = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        System.out.println("Enter array:   " + Arrays.toString(arrayForSorting));
        int low = 0; //low board array
        int high = arrayForSorting.length - 1; //high board array
        fastSorting.quickSort(arrayForSorting, low, high);
        System.out.println("After sorting: " + Arrays.toString(arrayForSorting));
    }
}
