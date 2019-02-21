package JavaAssign1;

public class Ques4 {
    String str="ToTheNew@123$%!";
    int lengthS = str.length();
    public void calculatePercentage()
    {
        int lower=0,upper=0,digits=0,special=0;
        for(int i=0;i<str.length();i++)
        {

            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                upper++;
            }
            else if (Character.isLowerCase(ch))
            {
                lower++;
            }
            else if (Character.isDigit(ch))
            {
                digits++;
            }
            else
            {
                special++;
            }
        }

        System.out.println("Original String is : " + str.toString());
        System.out.println("Percentage of Upper Case Letters = " + (upper*100)/lengthS + "%");
        System.out.println("Percentage of Lower Case Letters = " + (lower*100)/lengthS + "%");
        System.out.println("Percentage of Digits = " + (digits*100)/lengthS + "%");
        System.out.println("Percentage of Special Characters = " + (special*100)/lengthS + "%");

    }
}
