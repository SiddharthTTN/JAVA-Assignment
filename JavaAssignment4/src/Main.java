import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Ques1 q1 = new Ques1();
        float sum = q1.addNumbers(22.3F, 23F, 23.232F, 23.2332F, 32.23F);
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
        Employee e1 = new Employee("Gaurav", 22D, 25000D);
        Employee e2 = new Employee("Siddharth", 22D, 55000D);
        Employee e3 = new Employee("Vishakha", 25D, 35000D);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.sort((o1, o2) -> (int) (o2.salary - o1.salary));
        employeeList.forEach(System.out::println);
        System.out.println("");

        //Ques5
        Student s1 = new Student("Siddharth", 400D, 22D);
        Student s2 = new Student("Gaurav", 500D, 22D);
        Student s3 = new Student("Vishakha", 400D, 25D);
        Student s4 = new Student("Yatin", 450D, 24D);
        Student s5 = new Student("Mehak", 500D, 22D);
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.sort((o1, o2) -> {
            if (o2.score.equals(o1.score))
                return o1.name.compareTo(o2.name);
            else
                return (int) (o2.score - o1.score);
        });
        studentList.forEach(System.out::println);
        System.out.println("");

        //Ques6
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(6);
        linkedList.sort((o1, o2) -> o2 - o1);
        linkedList.forEach(x -> System.out.println(x));
        System.out.println("");

        //Ques7
        SpecialStack s = new SpecialStack();
        s.push(4);
        s.push(3);
        s.push(4);
        s.getMin();
        s.push(1);
        s.push(8);
        s.push(9);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
        System.out.println("");

        //Ques8
        Calendar cal = GregorianCalendar.getInstance();
//        System.out.println(cal.getTime());
        SimpleDateFormat date = new SimpleDateFormat("dd-MMMM-YYYY");
        System.out.println(date.format(cal.getTime()));
        System.out.println("");

        //Ques9
        Locale[] locale = DateFormat.getAvailableLocales();
        for (Locale l : locale) {
            DateFormat localeTime = DateFormat.getTimeInstance(DateFormat.SHORT, l);
             System.out.println(localeTime.format(new Date()));
        }

    }
}
