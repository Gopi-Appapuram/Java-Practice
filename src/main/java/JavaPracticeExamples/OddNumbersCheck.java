package JavaPracticeExamples;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OddNumbersCheck {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 3, 45, 76, 76);
        boolean result = onlyOddNumbers(list);
        System.out.println("All numbers are odd: " + result);
    }


    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }

        return true;
    }
}
