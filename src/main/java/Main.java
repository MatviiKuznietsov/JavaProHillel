public class Main {
    public static void main(String[] args) {
        String[][] array = new String[4][5];
        array[0][0] = String.valueOf(9);
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        try {
            arrayValueCalculator.doCalc(arrayValueCalculator.fillRandomArray(array));
        } catch (ArrayDataException arrayDataException) {
            System.out.println(arrayDataException);
        } catch (Exception e) {
            System.out.println("Fined new exception" + e);
        }
    }
}