import java.util.Scanner;

public class Ques8 {
    String str;
    Scanner sc = new Scanner(System.in);

    void perform() {
        System.out.println("Please enter the String");
        while (true) {
            str = sc.nextLine();
            if (str.equals("done")) {
                break;
            } else {
                if (str.charAt(0) == str.charAt(str.length() - 1)) {
                    System.out.println("First and the Last characters are equal");
                } else {
                    System.out.println("First and Last characters are not equal");
                }
            }

        }

    }
}