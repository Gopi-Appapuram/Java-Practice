package JavaPracticeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * removeDuplicatesFromTheList
 */
public class removeDuplicatesFromTheList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        List<Integer> listOfDuplicatedIntergers = new ArrayList<>();

        for (String str : inputArray) {
            try {
                listOfDuplicatedIntergers.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + str + " is not an interger.");
            }
        }
        List<Integer> listOfIntergers = new ArrayList<>();
        for (Integer integer : listOfDuplicatedIntergers) {
            if(!listOfIntergers.contains(integer))
                listOfIntergers.add(integer);
        }
        System.out.println(listOfIntergers);

    }
}