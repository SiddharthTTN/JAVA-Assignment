import java.util.HashMap;
import java.util.Map;

class Ques3 {
    void numberOfCharacterOccurence(String str) {
        System.out.println("The number of occurrence of characters in the String ' " + str + " ' are");
        Map<Character, Integer> charOccurrence = new HashMap<>();

        char[] a = str.toCharArray();
        for (char c : a) {
            if (charOccurrence.containsKey(c)) {
                charOccurrence.put(c, charOccurrence.get(c) + 1);
            } else {
                charOccurrence.put(c, 1);
            }
        }
        System.out.println(charOccurrence);
    }
}
