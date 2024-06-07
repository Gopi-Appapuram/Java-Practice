package JavaPracticeExamples;

import java.text.DecimalFormat;

public class FindingTheSquareRootOfANumber {

    public static void main(String[] args) {
        int number = 15;
        double sqrtroot = squareRootOfANumber(number);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println(numberFormat.format(sqrtroot));
    }

    public static double squareRootOfANumber(int number) {
        double t;
        double sqrtroot = number / 2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (number / t)) / 2;
        } while ((t - sqrtroot) != 0);
        return sqrtroot;
    }
}
