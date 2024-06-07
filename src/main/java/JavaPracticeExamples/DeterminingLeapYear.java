package JavaPracticeExamples;

import java.util.Scanner;

public class DeterminingLeapYear {

    /* Program to determine whether a given year is a leap year or not. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year to check it is a leap year or not: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();

    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        return isLeapYear;
    }
}
