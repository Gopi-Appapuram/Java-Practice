package JavaPracticeExamples;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "radar";
        boolean isPalindrome = isPalindrome(str);
        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();

        // Remove non-alphanumeric characters from the string
        str = str.replaceAll("[^a-z0-9]", "");

        // Compare the string with its reverse
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}

