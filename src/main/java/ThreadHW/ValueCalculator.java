package ThreadHW;

public class ValueCalculator {

    private float[] array;

    public float[] getArray() {
        return array;
    }

    public void setArray(float[] array) {
        this.array = array;
    }

    private int arraySize;

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    private float[] arrayA;
    private float[] arrayB;

    public float[] getArrayA() {
        return arrayA;
    }

    public void setArrayA(float[] arrayA) {
        this.arrayA = arrayA;
    }

    public float[] getArrayB() {
        return arrayB;
    }

    public void setArrayB(float[] arrayB) {
        this.arrayB = arrayB;
    }

    public void displayArraySize() {
        this.array = new float[getArraySize()];
        System.out.println("Display array size - " + array.length);
    }

    public void displayHalfArray(float[] array) {
        for (int i = 0; i < getArraySize() / 2; i++) {
            System.out.println(array[i]);
        }
    }

    public long startTimer() {
        long startTime = System.currentTimeMillis();
        return startTime;
    }

    public float[] fillArray(float[] array) {
        for (int i = 0; i < getArraySize(); i++) {
            array[i] = 1;
        }
        return array;
    }

    public void fillArrayWithFormula(float[] array) {
        for (int i = 0; i < getArraySize() / 2; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public void divideArrays(float[] array) {
        float[] arrayA = new float[getArraySize() / 2];
        float[] arrayB = new float[getArraySize() / 2];
        System.arraycopy(array, 0, arrayA, 0, getArraySize() / 2);
        System.arraycopy(array, getArraySize() / 2, arrayB, 0, getArraySize() / 2);
        setArrayA(arrayA);
        setArrayB(arrayB);
    }

    public void mergeArray(float[] arrayA, float[] arrayB) {
        System.arraycopy(arrayA, 0, array, 0, arrayA.length);
        System.arraycopy(arrayB, 0, array, 5, arrayB.length);
    }
}
