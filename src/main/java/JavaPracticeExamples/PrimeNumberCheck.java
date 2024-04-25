package JavaPracticeExamples;
import java.util.Scanner;
import java.lang.System;


public class PrimeNumberCheck {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: " );
        int Value = scanner.nextInt();
        System.out.println(isPrime(Value));
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
