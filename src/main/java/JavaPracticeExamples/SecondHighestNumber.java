package JavaPracticeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondHighestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        // Convert list to array
        int[] numbersArray = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            numbersArray[i] = numbers.get(i);
        }
        int secondHighest = findSecondHighest(numbersArray);
        System.out.println("Second highest number: " + secondHighest);

    }

    private static int findSecondHighest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int highest = array[0]; // Initialize with the first element
        int secondHighest = array[1]; // Initialize with the second element

        for (int i = 2; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest) {
                secondHighest = array[i];
            }
        }
        return secondHighest;
    }
}
