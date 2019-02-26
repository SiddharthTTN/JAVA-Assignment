package assignment.java.oops;

public class Ques1 {

    String str1="This is the original text";
    public void replaceString(String str2, String str3)
    {
        System.out.println(str1);
        str1 = str1.replace(str2,str3);
        System.out.println(str1);
    }

}
