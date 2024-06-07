package JavaPracticeExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class frequencyOfEachElementInArray {

    public static void main(String[] args) {
        System.out.println(characterFrequency());
    }

    public static  HashMap<String, Integer> characterFrequency() {
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        List<String> listOfDuplicates = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        
        for (String str : inputArray) {
            try {
                listOfDuplicates.add(str);
            }catch(Exception e){

            }
        }

        for (String element : listOfDuplicates) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }
        return frequencyMap;
    }
}
