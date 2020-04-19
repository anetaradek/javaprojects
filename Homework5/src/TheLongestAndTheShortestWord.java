import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class TheLongestAndTheShortestWord {
    public static void main(String[] args) {
        String sentence = "For given text find the longest and the shortest words";
        System.out.println(sentence);

        String[] words = sentence.split(" ");

        int min = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() <= min) {
                min = words[i].length();
            }
        }
        int max = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= max) {
                max = words[i].length();
            }
        }
        Set<String> shortestWords = new HashSet<>();
        Set<String> longestWords = new HashSet<>();
        for (String word : words) {
            if (word.length() == min) {
                shortestWords.add(word);
            }
            if (word.length() == max) {
                longestWords.add(word);
            }
        }
        System.out.println("The shortest words are" + shortestWords.toString());
        System.out.println("The longest words are" + longestWords.toString());
    }
}