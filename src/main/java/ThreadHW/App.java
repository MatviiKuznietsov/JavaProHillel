package ThreadHW;

public class App {
    public static void main(String[] args) {
        ValueCalculator valueCalculator = new ValueCalculator();
        long time = valueCalculator.startTimer();
        valueCalculator.setArraySize(10000000);
        valueCalculator.displayArraySize();
        valueCalculator.divideArrays(valueCalculator.fillArray(valueCalculator.getArray()));
        try {
            Runnable task1 = () -> {
                valueCalculator.fillArrayWithFormula(valueCalculator.getArrayA());
            };
            Runnable task2 = () -> {
                valueCalculator.fillArrayWithFormula(valueCalculator.getArrayB());
            };
            Thread thread1 = new Thread(task1);
            Thread thread2 = new Thread(task2);
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("You have interrupt" + e);
        }
        valueCalculator.mergeArray(valueCalculator.getArrayA(), valueCalculator.getArrayB());
        long deltaTime = valueCalculator.startTimer() - time;
        System.out.println("You spend " + deltaTime + " ms");
    }
}
