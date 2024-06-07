package JavaPracticeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class printListOfIntergerMulBy5 {
    public static void main(String[] args) {
        List<Integer> inputList = loadUserInput();

        List<Integer> listMulipledBy5 = isMultiplyBy5(inputList);
        System.out.println(listMulipledBy5);
    }

    public static List<Integer> loadUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numbers separated by ' ': ");
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

    public static List<Integer> isMultiplyBy5(List<Integer> listOfIntegers){
        List<Integer> listOfNumbersMultipliedBy5 = new ArrayList<>();
        for (Integer integer : listOfIntegers) {
            if(integer % 5 == 0)
                listOfNumbersMultipliedBy5.add(integer);
        }
        return listOfNumbersMultipliedBy5;
    }

}
