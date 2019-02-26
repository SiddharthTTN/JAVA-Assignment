import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ques1 q1=new Ques1();
        float sum = q1.addNumbers(22.3F,23F,23.232F,23.2332F,32.23F);
        System.out.println("The sum is : " + sum);
        System.out.println("");

        Ques2 q2 = new Ques2();
        int uniqueChars = q2.returnUniqueChars("tttttsss");
        System.out.println("Number of unique characters are : " + uniqueChars);
        System.out.println("");

        Ques3 q3 = new Ques3();
        q3.numberOfCharacterOccurence("tothenewww");
        System.out.println("");

        //Ques4
        Employee e1 = new Employee("Gaurav",22D,25000D);
        Employee e2 = new Employee("Siddharth",22D,55000D);
        Employee e3 = new Employee("Vishakha",25D,35000D);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.sort((o1,o2) -> (int) (o2.salary-o1.salary));
        employeeList.forEach((x)-> System.out.println(x));
        System.out.println("");


    }
}
