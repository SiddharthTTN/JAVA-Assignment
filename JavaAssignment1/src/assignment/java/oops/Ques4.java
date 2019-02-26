package assignment.java.oops;

public class Ques4 {
    String str = "ToTheNew@123$%!";
    int lengthS = str.length();

    public void calculatePercentage() {
        Float lower = 0F, upper = 0F, digits = 0F, special = 0F;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Original String is : " + str.toString());
        System.out.println("Percentage of Upper Case Letters = " + (upper * 100) / lengthS + "%");
        System.out.println("Percentage of Lower Case Letters = " + (lower * 100) / lengthS + "%");
        System.out.println("Percentage of Digits = " + (digits * 100) / lengthS + "%");
        System.out.println("Percentage of Special Characters = " + (special * 100) / lengthS + "%");

    }
}
