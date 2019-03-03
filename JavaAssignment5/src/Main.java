import com.ques1.*;
import com.ques2.ReturnOneInteger;
import com.ques4.Employee;
import com.ques4.EmployeeInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
        System.out.println("");

        //Ques4
        EmployeeInterface createInstance = Employee::new;
        Employee employee=createInstance.createEmployee("Siddharth",22,"Yamunanagar");
        System.out.println(employee.toString());
        System.out.println("");

        //Ques5
        Consumer<Integer> printValue = (a)-> System.out.println("The value given is " + a);
        printValue.accept(33);

        Supplier<Integer> valueReturned = ()-> 6;
        System.out.println("The Value returned by Supplier is : " +valueReturned.get());

        Predicate<Integer> checkValue=(a)->a>20;
        System.out.println("Is value greater than 10");
        System.out.println(checkValue.test(22));

        Function<Integer,Integer> squareNumbers=(a)-> a*a ;
        int b= squareNumbers.apply(4);
        System.out.println("Square is: " + b);

        //Ques6
    }

}
