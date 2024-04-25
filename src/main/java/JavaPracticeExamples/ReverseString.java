package JavaPracticeExamples;

import java.util.Locale;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        /*
        * How do you reverse a string in Java?
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();

        // Create an empty string to store the reversed string
        String reversed = "";
        System.out.println(original.length());

        // Iterate over the original string in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}

