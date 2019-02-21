package JavaAssign1;

import java.util.SortedMap;

public class Ques3 {

    String str="To The New Digital";
    String str1=str.toLowerCase();
    String str2=str1.replace(" ","");

   public void countChar(char a)
    {
        System.out.println("The original String is : " + str.toString());
        System.out.print("Number of " + a + " in String are : ");
        System.out.println(str2.length() - str2.replace(Character.toString(a),"").length());
    }

}

