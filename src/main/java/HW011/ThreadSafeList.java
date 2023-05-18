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

    public synchronized void add(Integer val) {
        for (int i = 0; i < countElements; i++) {
            arrayList.add(val);
        }
        System.out.println("Content of list = " + arrayList);
    }

    public synchronized Integer get(Integer val) {
        //int index = random.nextInt(countElements);
        int element = arrayList.get(val);
        System.out.println("\nGet Element with index " + val + " = " + element);
        return element;
    }

    public synchronized void remove(Integer val) {
        arrayList.remove(random.nextInt(100));
        System.out.printf("%s - %d %s %d %s", "Element", arrayList.get(val), "with index", val, "was remove");
    }
}
