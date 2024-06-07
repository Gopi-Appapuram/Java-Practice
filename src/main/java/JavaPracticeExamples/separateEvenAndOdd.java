package JavaPracticeExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class separateEvenAndOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        List<Integer> listOfIntergers = new ArrayList<>();

        for (String str : inputArray) {
            try {
                listOfIntergers.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + str + " is not an interger.");
            }
        }

        Map<Boolean, List<Integer>> oddEvenNumberMap = new HashMap<>();
        oddEvenNumberMap.put(true, new ArrayList<>());
        oddEvenNumberMap.put(false, new ArrayList<>());

        for (Integer i : listOfIntergers) {
            if (i % 2 == 0) {
                oddEvenNumberMap.get(true).add(i);
            } else {
                oddEvenNumberMap.get(false).add(i);
            }
        }

        System.out.println("Even numbers: " + oddEvenNumberMap.get(true));
        System.out.println("Odd numbers: " + oddEvenNumberMap.get(false));

    }
}
