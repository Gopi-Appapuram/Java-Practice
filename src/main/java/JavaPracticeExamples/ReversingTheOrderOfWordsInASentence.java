package JavaPracticeExamples;

public class ReversingTheOrderOfWordsInASentence {

    /* Program to reverse the order of words in any given sentence. */
    
    public static void main(String[] args) {
        String sentence = "Hello world how are you";
        String reversed = reverseWords(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversed);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
