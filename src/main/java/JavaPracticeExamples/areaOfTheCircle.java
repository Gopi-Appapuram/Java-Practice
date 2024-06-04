package JavaPracticeExamples;

import java.util.Scanner;

public class areaOfTheCircle {
    final static double pieValue = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        int value = scanner.nextInt();
        double areaOfTheCircle = pieValue * Math.pow(value, 2);
        System.out.println("Area of the circle with radius " + value + " is: " + areaOfTheCircle +"." );
    }
}
