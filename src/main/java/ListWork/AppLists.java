package ListWork;

import net.datafaker.Faker;

import java.util.*;

public class AppLists {
    public static void main(String[] args) {
        Faker faker = new Faker(new Random(10));

        List<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add(faker.breakingBad().character());
            System.out.println(words.get(i));
        }
        String wordFind = words.get(5);

        int[] numbers = {5, 6, 7, 9, 6, 3, 2, 1, 4, 5, 6, 7, 5, 1, 0};

        List<Integer> digits = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            digits.add(random.nextInt(10));
        }

        List<String> words2 = new ArrayList<>();
        words2.add("hello");
        words2.add("hi");
        words2.add("hello");
        words2.add("Good day");
        words2.add("hello");
        words2.add("hi");
        words2.add("Good morning");
        words2.add("How are you");
        words2.add("hello");
        words2.add("hi");
        words2.add("hello");
        words2.add("Good day");
        words2.add("hello");
        words2.add("hi");
        words2.add("Good morning");
        words2.add("How are you");

        ListWorks listWorks = new ListWorks();
        System.out.println("Quantity same words = " + listWorks.countOccurance(words, wordFind));
        listWorks.toList(numbers);
        System.out.println("Distinct numbers = " + listWorks.findUnique(digits));
        listWorks.calcOccurance(words2);
        for (Map.Entry entry : listWorks.findOccurance(words2).entrySet()) {
            System.out.println("{name:" + entry.getKey() + " ,occurrence: "
                    + entry.getValue() + "}");
        }
        ;


    }
}
