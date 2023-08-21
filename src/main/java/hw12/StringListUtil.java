package hw12;

import java.util.*;
public class StringListUtil {
    public static int countOccurrence(List<String> stringList, String targetString) {
        int count = 0;
        for (String str : stringList) {
            if (str.equals(targetString)) {
                count++;
            }
        }
        return count;
    }

    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        Set<Integer> uniqueNumbersSet = new HashSet<>(numbers);
        return new ArrayList<>(uniqueNumbersSet);
    }

    public static void calcOccurance(List<String> words) {
        Map<String, Integer> occuranceMap = new HashMap<>();
        for (String word : words) {
            occuranceMap.put(word, occuranceMap.getOrDefault(word, 0) + 1);
        }
        for (String word : occuranceMap.keySet()) {
            int count = occuranceMap.get(word);
            System.out.println(word + " : " + count);
        }
    }

    public static List<WordOccurance> findOccurance(List<String> words) {
        Map<String, Integer> occuranceMap = new HashMap<>();
        for (String word : words) {
            occuranceMap.put(word, occuranceMap.getOrDefault(word, 0) + 1);
        }

        List<WordOccurance> occurrenceList = new ArrayList<>();
        for (String word : occuranceMap.keySet()) {
            int occurrence = occuranceMap.get(word);
            occurrenceList.add(new WordOccurance(word, occurrence));
        }
        return occurrenceList;
    }

    public static class WordOccurance {
        private String name;
        private int occurrence;

        public WordOccurance(String name, int occurrence) {
            this.name = name;
            this.occurrence = occurrence;
        }

        public String getName() {
            return name;
        }

        public int getOccurrence() {
            return occurrence;
        }
    }
}
