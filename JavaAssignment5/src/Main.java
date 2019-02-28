import com.Ques1.*;
import com.Ques2.AddNumbers;
import com.Ques2.ReturnOneInteger;

public class Main {
    public static void main(String[] args) {

        //Ques1
        NumberGreaterOrNot numberGreaterOrNot = (a, b) -> {
            if (a > b) {
                System.out.println("FirstNumber is greater");
                return true;
            } else {
                System.out.println("FirstNumber is not greater");
                return false;
            }
        };
        numberGreaterOrNot.checkNumber(5, 6);

        ChangeToUpperCase changeToUpperCase = (String::toUpperCase);
        System.out.println(changeToUpperCase.changeToUpperCase("Siddharth"));


        IncrementNumber incrementNumber = (a -> a++);
        System.out.println(incrementNumber.incrementNumber(5));


        ConcatinateStrings concatinateStrings = ((str, str1) -> str + str1);
        System.out.println(concatinateStrings.concatinateString("abc", "xyz"));

        System.out.println("");

        //Ques2
        ReturnOneInteger returnOneInteger = (a, b) -> a + b;
        System.out.println(returnOneInteger.returnInteger(7, 8));


    }

}
