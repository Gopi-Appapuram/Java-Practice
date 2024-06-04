package JavaPracticeExamples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first string: ");
        String firstString = scanner.nextLine();
        System.out.println("Please enter your second string: ");
        String secondString = scanner.nextLine();

        if (firstString.length() != secondString.length()){
            System.out.println("The given strings are not anagram.");
        }else {
            char[] charsArray1 = firstString.toCharArray();
            char[] charsArray2 = secondString.toCharArray();

            // Sort the char arrays
            Arrays.sort(charsArray1);
            Arrays.sort(charsArray2);
            if (Arrays.equals(charsArray1, charsArray2)) {
                System.out.println("The given strings are anagrams.");
            } else {
                System.out.println("The given strings are not anagrams.");
            }
        }
    }
}
