

public class Main {


    public static void main(String[] args)
    {
        Ques1 q1=new Ques1();
        Ques1 q2=new Ques1();
        Ques1 q3=new Ques1();
        q1.addBook("Java",101);
        q2.addBook("Python",102);
        q3.addBook("Spring",103);
        q1.assignIssuer("Siddharth",201);
        q2.assignIssuer("Gaurav",202);
        q3.assignIssuer("Vagheesh",203);
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
        q2.removeIssuer();
        System.out.println(q2);
        System.out.println("");

        //   Ques2 q1=new Ques2();   //We cannot create the instance of the class
        Ques4.getInstance();
        System.out.println("");

        Ques7 q7 = new Ques7();
        q7.calculate(876543);

    }
}
