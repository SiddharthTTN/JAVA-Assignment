import com.lms.Author;
import com.lms.Ques1;

import java.net.Authenticator;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {
        Ques1 q1 = new Ques1();
        Ques1 q01 = new Ques1();
        Ques1 q001 = new Ques1();
        Author a1 = new Author("abc",1);
        Author a2 = new Author("xyz",2);
        q1.addBook("Java", 101,a1);
        q01.addBook("Python", 102,a2);
        q001.addBook("Spring", 103,a1);
        q1.assignIssuer("Siddharth", 201);
        q01.assignIssuer("Gaurav", 202);
        q001.assignIssuer("Vagish", 203);
        System.out.println(q1);
        System.out.println(q01);
        System.out.println(q001);
        q01.removeIssuer();
        System.out.println(q01);
        System.out.println("");

        Ques2 q2 = new Ques2();
        q2.sortString();
        System.out.println("");

        //Ques 3 in the end // Delete the Ques4.class file

        //   Ques4 q4=new Ques4();   //We cannot create the instance of the class
        Ques4.getInstance();
        System.out.println("");

        Ques5 q5 = new Ques5();
        q5.name = "Siddharth";
        q5.city = "Noida";
        Ques5 q05 = new Ques5(q5);
        Ques5 q005 = (Ques5) q5.clone();
        System.out.println(q5);
        System.out.println(q05);
        System.out.println(q005);
        System.out.println("");

        Ques6 q6 = new Ques6();
        q6.perform();
        System.out.println("");

        Ques7 q7 = new Ques7();
        q7.calculate(876543);
        System.out.println("");

        Ques8 q8 = new Ques8();
        q8.perform();
        System.out.println("");

        //Ques9
        Furniture wooden = new Wooden();
        Furniture metal = new Metal();
        wooden.firetest(Furniture.Type.CHAIR);
        metal.firetest(Furniture.Type.CHAIR);
        wooden.stress(Furniture.Type.CHAIR);
        metal.stress(Furniture.Type.CHAIR);
        wooden.firetest(Furniture.Type.TABLE);
        metal.firetest(Furniture.Type.TABLE);
        wooden.stress(Furniture.Type.TABLE);
        metal.stress(Furniture.Type.TABLE);

        System.out.println("");

        //Ques10
        Ques11 q11 = new Ques11();
        q11.perform();
        System.out.println("");

        //Ques12
        Child ch = new Child();
        System.out.println("");

        //Ques13
        try {
            throw new Ques13("My Custom Exception");
        } catch (Ques13 ques13) {
            System.out.println("Exception is caught!!!");
//            ques13.printStackTrace();
        }
        System.out.println("");

        System.out.println("Exception will be generated");
        Ques3 q3 = new Ques3();
    }
}
