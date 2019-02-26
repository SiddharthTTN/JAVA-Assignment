import java.util.HashSet;

class Ques2 {
    int returnUniqueChars(String str){
        HashSet<Character> charSet = new HashSet<>();
        char[] a=str.toCharArray();
        for (char c : a) {
            charSet.add(c);
        }
        return charSet.size();
    }
}
