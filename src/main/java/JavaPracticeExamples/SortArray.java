package JavaPracticeExamples;

import java.util.*;

public class SortArray {

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

        sortArray(numbers);

        System.out.println("Sorted numbers: " + numbers);
    }

    public static void sortArray(List<Integer> list) {
        Collections.sort(list);
    }
}

