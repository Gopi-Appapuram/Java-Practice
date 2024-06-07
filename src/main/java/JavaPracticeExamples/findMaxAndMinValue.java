package JavaPracticeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class findMaxAndMinValue {
    // Given a list of integers, find maximum and minimum of those numbers?

    public static void main(String[] args) {
        findMaxAndMinValue findMaxAndMinValue = new findMaxAndMinValue();
        List<Integer> userInputList = findMaxAndMinValue.loadData();
        findMaxAndMinValue.minMaxOfList(userInputList);
    }

    public List<Integer> loadData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        List<Integer> listOfNumbers = new ArrayList<>();

        for (String str : inputArray) {
            try {
                listOfNumbers.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + str + " is not an interger.");
            }
        }
        scanner.close();
        return listOfNumbers;
    }

    public void minMaxOfList(List<Integer> userInputList) {
        if (userInputList.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        int min = userInputList.get(0);
        int max = userInputList.get(0);

        for (int i = 1; i < userInputList.size(); i++ ){
            int currentNumber = userInputList.get(i);
            if (currentNumber < min) {
                min = currentNumber;
            }
            if (currentNumber > max){
                max = currentNumber;
            }
        }
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
