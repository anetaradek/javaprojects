package UniqueLetters;

import java.util.HashSet;
import java.util.Set;

public class UniqueLettersVer2 {
    public static void main(String[] args) {
        //For given text print out all unique letters. For example This is a test text
        // Should give a response: T, h, i, s, a, t, e, x
        String sentence = "This is a test text";
        System.out.println(sentence);
        sentence = sentence.replace(" ", "");
        char[] letters = sentence.toCharArray();
        Set<String> uniqueLetters = new HashSet<>();

        for (char c : letters) {
            String s = Character.toString(c);
            uniqueLetters.add(s);
        }

        System.out.println("The unique letters are: " + uniqueLetters);
    }
}
