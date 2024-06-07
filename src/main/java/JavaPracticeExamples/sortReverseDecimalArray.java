package JavaPracticeExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sortReverseDecimalArray {

    public static void main(String[] args) {

        List<Double> arrayList = sortArrayInReverse();
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList);

    }

    public static List<Double> sortArrayInReverse() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        List<Double> listOfDuplicatedIntergers = new ArrayList<>();

        for (String str : inputArray) {
            try {
                listOfDuplicatedIntergers.add(Double.parseDouble(str));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + str + " is not an interger.");
            }
        }
        scanner.close();
        return listOfDuplicatedIntergers;

    }
}
