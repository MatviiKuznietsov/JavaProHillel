import java.util.Random;

public class ArrayValueCalculator {
    public int doCalc(String[][] array) throws ArrayDataException {
        System.out.println("\nArray size " + array.length + "x" + array[0].length); //show array size
        try {
            if (array.length != 4 || array[0].length != 4) {
                throw new ArraySizeException("Size of array is`n compatible");
            }
        } catch (ArraySizeException e) {
            System.out.println("Array size isn`t 4x4 " + e);
        }
//--------------------------------------------------------------------------------------------------------
        System.out.println("\nChecked array");
        int summ = 0;
        int status = 0;
        array[1][3] = "Y"; //add exception problem
        array[0][3] = "G"; //add exception problem
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    summ = summ + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException numberFormatException) {
                    status++;
                    System.out.println("Input " + array[i][j] + " symbol in element " + i + "/" + j + " is not digital " + numberFormatException);
                }
            }
        }
        if (status > 0) {
            throw new ArrayDataException("You have problem with input data!");
        }
        System.out.println("\nSum = " + summ);
        return summ;
    }

    public String[][] fillRandomArray(String[][] array) {
        Random random = new Random();
        System.out.println("Filled array ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                int randomNumber = random.nextInt(100);
                array[i][j] = String.valueOf(randomNumber);
                System.out.print(array[i][j] + " ");
            }
        }
        return array;
    }
}
