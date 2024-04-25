package JavaPracticeExamples;

import java.util.Scanner;

public class CheckVowelsPresentInString {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your string: ");
            String Value = scanner.nextLine();
            System.out.println(stringContainsVowels(Value));

        }

        public static boolean stringContainsVowels(String input) {
            return input.toLowerCase().matches(".*[aeiou].*");
        }
}
