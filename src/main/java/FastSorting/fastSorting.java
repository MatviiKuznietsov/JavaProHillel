package FastSorting;

import java.util.Arrays;

public class fastSorting {
    public void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return; // if array size = 0
        }
        if (low >= high) {
            return; // if array end
        }
        //-------------------------------------------------------------
        int middle = low + (high - low) / 2; //choose support element
        int opora = array[middle];
        //-------------------------------------------------------------
        int i = low, j = high; //divide for sub-arrays

        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) { //change places
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)  // ivoke rekurse left
            quickSort(array, low, j);
        if (high > i)  // ivoke rekurse right
            quickSort(array, i, high);
    }

}
