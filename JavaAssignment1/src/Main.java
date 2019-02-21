import JavaAssign1.*;


public class Main {

    static void assignment1() {
        Ques1 q1 = new Ques1();
        q1.replaceString("original", "new");
        System.out.println("");

        Ques2 q2 = new Ques2();
        q2.displayWords();
        System.out.println("");

        Ques3 q3 = new Ques3();
        q3.countChar('t');
        System.out.println("");

        Ques4 q4 = new Ques4();
        q4.calculatePercentage();
        System.out.println("");

        Ques5 q5 = new Ques5();
        q5.compare();
        System.out.println("");
        System.out.println("");

        Ques6 q6 = new Ques6();
        q6.printChar();
        System.out.println("");

        Ques7.printlname();
        System.out.println("Age is : " + Ques7.age);
        System.out.println("");

        Ques8 q8 = new Ques8();
        q8.removeChar();
        System.out.println("");

        Ques9 q9 = new Ques9();
        q9.getPrice();
        System.out.println("");

        Ques10 q10 = new Ques10();
        q10.add(2, 3);
        q10.add(2.55, 3.89);
        q10.multply(2, 3);
        q10.multply(2.88F, 3.45F);
        q10.concat("abc", "xyz");
        q10.concat("abc", "xyz", "pqr");
        System.out.println("");

        Ques11 q11 = new SBI();
        Ques11 q12 = new BOI();
        Ques11 q13 = new ICICI();
        Ques11 q14 = new Ques11();
        q11.getDetails();
        q12.getDetails();
        q13.getDetails();
        q14.getDetails();
    }



    public static void main(String[] args)
    {
        assignment1();

    }
}
