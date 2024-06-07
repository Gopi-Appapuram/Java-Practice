package JavaPracticeExamples;

import java.util.HashMap;

import java.util.Map;

public class findDulplicatedWordsInString {
    public static void main(String[] args) {
        String lines = "Get busy living or get busy dying --Stephen King";
 
        findDuplicates(lines);
    }

    public static void findDuplicates(String str) {
        Map<String, Integer> wordsList = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {
            wordsList.put(word, wordsList.getOrDefault(word, 0) + 1);
        }
        System.out.print(wordsList);
    }
}
