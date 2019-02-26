import java.util.HashMap;

class Ques3 {
    void numberOfCharacterOccurence(String str) {
        System.out.println("The number of occurence of characters in the String ' " + str + " ' are" );
        HashMap<Character, Integer> charOccurence = new HashMap<>();
        int count = 0;
        char[] a = str.toCharArray();
        for (char c : a) {
            if (charOccurence.containsKey(c)) {
                charOccurence.put(c, charOccurence.get(c) + 1);
            } else {
                charOccurence.put(c, 1);
            }
        }
        System.out.println(charOccurence);


    }
}
