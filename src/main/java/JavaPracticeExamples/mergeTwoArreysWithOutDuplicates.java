package JavaPracticeExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class mergeTwoArreysWithOutDuplicates {
    public static void main(String[] args) {

        List<String> firstArray = getDataFromUser();
        List<String> secondArray = getDataFromUser();

        Collections.sort(firstArray);
        Collections.sort(secondArray);

        HashMap<String, Integer> filterdFirstArray = new HashMap<>();

        for (String integer : firstArray) {
            filterdFirstArray.put(integer, filterdFirstArray.getOrDefault(integer, 0) + 1);
        }

        HashMap<String, Integer> filterdSecondArray = new HashMap<>();

        for (String integer : secondArray) {
            filterdSecondArray.put(integer, filterdSecondArray.getOrDefault(integer, 0) + 1);
        }

        List<String> finalArray = new ArrayList<>();

        for (String integer : filterdFirstArray.keySet()) {
            finalArray.add(integer);
        }
        for (String integer : filterdSecondArray.keySet()) {
            if (!finalArray.contains(integer)){
                finalArray.add(integer);
            }
        }

        System.out.println("The final array with out duplicates is: " + finalArray);
    }

    public static List<String> getDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();
        
        System.out.println("please enter the vales separated by blank space: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        for (String integer : inputArray) {
            numbers.add(integer);
        }
        return numbers;
    }

}
