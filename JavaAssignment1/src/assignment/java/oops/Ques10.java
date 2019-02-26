package assignment.java.oops;

public class Ques10 {

    public void add(int a, int b)
    {
        System.out.println("Two Integer number are added :");
        int c= a + b;
        System.out.println(a + " + " + b + " = " + c);
    }

    public void add(double a, double b)
    {
        System.out.println("Two Double number are added :");
        double c= a + b;
        System.out.println(a + " + " + b + " = " + c);
    }

    public void multply(int a, int b)
    {
        System.out.println("Two Integer are multiplied :");
        int c=a*b;
        System.out.println(a + " * " + b + " = " + c);
    }

    public void multply(float a, float b)
    {
        System.out.println("Two Float are multiplied :");
        float c=a*b;
        System.out.println(a + " * " + b + " = " + c);
    }

    public void concat(String a, String b)
    {
        System.out.println("The two concated string is :");
        String  c=a+b;
        System.out.println(c);
    }

    public void concat(String a, String b, String c)
    {
        System.out.println("The three concated string is :");
        String  d=a+b+c;
        System.out.println(d);
    }



}
