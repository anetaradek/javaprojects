package letterCounter;

import java.util.ArrayList;
import java.util.List;

public class LetterCounter {
    public static void main(String[] args) {
        System.out.println("For given text print out count for each letter inside. For example: This is a test text");
        System.out.println("Should give a response: T - 1, h - 1, i - 2, s - 3... and so on.");
        String text = ("This is a test text");
        String textWithoutSpaces = text.replace(" ", "");
        char[] textCharacters = textWithoutSpaces.toCharArray();
        List<Character> characterArrayList = new ArrayList<>();
        for (Character ch : textCharacters) {
            characterArrayList.add(ch);
        }
        for (int i = 0; i <characterArrayList.size() ; i++) {
            System.out.print(characterArrayList.get(i)+" - "+i+", ");
        }
    }
}