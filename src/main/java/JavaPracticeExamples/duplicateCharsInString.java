package JavaPracticeExamples;

import java.util.HashMap;
import java.util.Map;

public class duplicateCharsInString {


    public static void main(String[] args) {
        findDuplicates("name of the place");
    }

    public static void findDuplicates(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for(char c : str.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(charCountMap);
    }
}
