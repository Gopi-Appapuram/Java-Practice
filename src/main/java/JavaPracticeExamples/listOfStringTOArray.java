package JavaPracticeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listOfStringTOArray {

    // Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix
    // and ‘,’ as delimiter?

    public static void main(String[] args) {

        String[] inputArray = loadStringArray();
        List<String> stringArray = new ArrayList<>();

        for (String str : inputArray) {
            try {
                stringArray.add(str);
            } catch (NumberFormatException e) {

            }
        }

        System.out.println(stringArray);
    }

    public static String[] loadStringArray() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numbers separated by ', ': ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(", ");

        scanner.close();
        return inputArray;
    }

}
