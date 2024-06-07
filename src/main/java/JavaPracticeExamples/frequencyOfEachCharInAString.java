package JavaPracticeExamples;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfEachCharInAString {



    public static void main(String[] args) {
        System.out.println(characterFrequency("Please main proper distance"));
    }



    
    public static HashMap<Character, Integer> characterFrequency(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (Character character : str.toCharArray()) {
            if(frequencyMap.containsKey(character)){
                frequencyMap.put(character, frequencyMap.get(character)+1);
            }else {
                frequencyMap.put(character, 1);
            }
        }
        return frequencyMap;
    }
}
