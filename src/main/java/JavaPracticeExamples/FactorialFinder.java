package JavaPracticeExamples;

import java.util.Scanner;

public class FactorialFinder {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of the given number is " + factorial(n));
    }

    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
