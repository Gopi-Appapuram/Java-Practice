package JavaPracticeExamples;

import java.util.Scanner;

public class RemoveLeadingSpaces {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string data: ");
        String Value = scanner.nextLine();
        removeSpaces(Value);
    }

    public static void removeSpaces(String Value){
        //remove the spaces at starting
        Value = Value.strip();
        System.out.println(Value);
    }
}
