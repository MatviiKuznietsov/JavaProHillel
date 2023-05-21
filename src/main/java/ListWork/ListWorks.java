package ListWork;

import java.util.*;

public class ListWorks {

    public int countOccurance(List<String> words, String wordFined) {
        int count = 0;
        for (String word : words) {
            if (word == wordFined) {
                count++;
            }
        }
        return count;
    }

    public void toList(int[] numbers) {

        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            digits.add(numbers[i]);
        }
        System.out.println("My new List =" + digits);

    }

    public Set<Integer> findUnique(List<Integer> digits) {
        Set<Integer> distinctList = new HashSet<>();
        for (int i = 0; i < digits.size(); i++) {
            distinctList.add(digits.get(i));
        }
        return distinctList;
    }

    public void calcOccurance(List<String> words) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            for (int i2 = 0; i2 < words.size(); i2++) {
                if (words.get(i) == words.get(i2)) {
                    count++;
                    map.put(words.get(i), count);
                }
            }
            count = 0;
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - "
                    + entry.getValue());
        }
        System.out.println();
    }

    public HashMap<String, Integer> findOccurance(List<String> words) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            for (int i2 = 0; i2 < words.size(); i2++) {
                if (words.get(i) == words.get(i2)) {
                    count++;
                    map.put(words.get(i), count);
                }
            }
            count = 0;
        }
        return map;
    }

}
