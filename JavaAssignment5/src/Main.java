import com.ques1.*;
import com.ques2.*;
import com.ques3.AddNumbers;
import com.ques3.ClassForMethodRefrencing;
import com.ques3.MultiplyNumbers;
import com.ques3.SubtractNumbers;
import com.ques4.*;
import com.ques6.ExtendInterface;
import com.ques6.StaticAndDefault;
import com.ques7.OverrideDefaultMethod;
import com.ques8.MultipleInheritanceClass;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //Ques3
        ClassForMethodRefrencing classForMethodRefrencing = new ClassForMethodRefrencing();
        AddNumbers addNumbers = classForMethodRefrencing::addNumbers;
        int x = addNumbers.add(3, 5);
        System.out.println("Addition is: " + x);
        SubtractNumbers subtractNumbers = classForMethodRefrencing::subtractNumbers;
        int y = subtractNumbers.subtract(9, 3);
        System.out.println("Subtraction is: " + y);
        MultiplyNumbers multiplyNumbers = ClassForMethodRefrencing::multiplyNumbers;
        int z = multiplyNumbers.multiply(5, 5);
        System.out.println("Multiplication is: " + z);
        System.out.println("");

        //Ques4
        EmployeeInterface createInstance = Employee::new;
        Employee employee = createInstance.createEmployee("Siddharth", 22, "Yamunanagar");
        System.out.println(employee.toString());
        System.out.println("");

        //Ques5
        Consumer<Integer> printValue = (a) -> System.out.println("The value given is " + a);
        printValue.accept(33);

        Supplier<Integer> valueReturned = () -> 6;
        System.out.println("The Value returned by Supplier is : " + valueReturned.get());

        Predicate<Integer> checkValue = (a) -> a > 20;
        System.out.println("Is value greater than 10");
        System.out.println(checkValue.test(22));

        Function<Integer, Integer> squareNumbers = (a) -> a * a;
        int square = squareNumbers.apply(4);
        System.out.println("Square is: " + square);
        System.out.println("");

        //Ques6
        ExtendInterface exe = new ExtendInterface();
        exe.normalMethod();
        exe.defaultMethod();
        StaticAndDefault.staticMethod();
        System.out.println("");

        //Ques7
        OverrideDefaultMethod overrideDefaultMethod = new OverrideDefaultMethod();
        overrideDefaultMethod.defaultMethod();
        System.out.println("");

        //Ques8
        MultipleInheritanceClass multipleInheritanceClass = new MultipleInheritanceClass();
        multipleInheritanceClass.method1();
        multipleInheritanceClass.method2();
        multipleInheritanceClass.methodOfInterface();
        System.out.println("");

        //Ques9
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbersList = integerList.stream()
                .filter((a) -> a % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbersList);
        System.out.println("");

        //Ques10
        int sum = integerList.stream()
                .mapToInt(value -> {
                    if (value > 5)
                        return value;
                    else
                        return 0;
                })
                .sum();
        System.out.println("The Sum is " + sum);
        System.out.println("");

        //Ques11
        double average = integerList.stream()
                .mapToInt(value -> value)
                .average().getAsDouble();
        System.out.println("The Average is: " + average);
        System.out.println("");

        //Ques12
        Stream<Integer> firstNumber = integerList.stream()
                .filter(a -> a > 3)
                .limit(1);
        System.out.println("The First number greater than 3 is: " + firstNumber.findFirst().orElse(0));
    }
}
