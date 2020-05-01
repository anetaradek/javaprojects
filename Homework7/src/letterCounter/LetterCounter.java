package letterCounter;

import java.util.LinkedHashMap;
import java.util.Map;

public class LetterCounter {
    public static void main(String[] args) {
        System.out.println("For given text print out count for each letter inside. For example: This is a test text");
        System.out.println("Should give a response: T - 1, h - 1, i - 2, s - 3... and so on.");
        String text = ("This is a test text");
        String textWithoutSpaces = text.replace(" ", "");
        Map<Character,Integer> counterMap=new LinkedHashMap<>();
        char[] textCharacters = textWithoutSpaces.toCharArray();
        for (Character ch : textCharacters) {
            if(counterMap.containsKey(ch)){
                Integer a = counterMap.get(ch)+1;
                counterMap.replace(ch,a);
            }else{
                counterMap.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : counterMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}