package JavaPracticeExamples;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        /*
        * How do you swap two numbers without using a third variable in Java?
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int FirstNumber = scanner.nextInt();
        System.out.println("Please enter your second number: ");
        int SecondNumber = scanner.nextInt();
        /*
        *Logic
        * a, b are two numbers
        * swaping
        * b = b+a
        * a = b-a
        * b = b-a
        * */
        SecondNumber = SecondNumber + FirstNumber;
        FirstNumber = SecondNumber - FirstNumber;
        SecondNumber = SecondNumber - FirstNumber;
        System.out.println("After Swapping: First Number = "+FirstNumber+", Second Number = " +SecondNumber+".");
    }
}
