package HW011;

import java.util.ArrayList;
import java.util.Random;

public class ThreadSafeList {

    private volatile ArrayList<Integer> arrayList;
    private volatile Random random;
    private volatile int countElements = 100;



    ThreadSafeList() {
        arrayList = new ArrayList<>();
        random = new Random();
    }

    public synchronized void add(Random random) {
        for (int i = 0; i < countElements; i++) {
            arrayList.add(random.nextInt(10) );
        }
        System.out.println("Content of list = " + arrayList);
    }

    public synchronized Integer get(Random random) {
        int index = random.nextInt(countElements);
        int element = arrayList.get(index);
        System.out.println("\nGet Element with index " + index + " = " + element);
        return element;
    }

    public synchronized void remove(Random random) {
        int index = arrayList.remove(random.nextInt(100));
        System.out.printf("%s - %d %s %d %s", "Element", arrayList.get(index), "with index", index, "was remove");
    }
}
