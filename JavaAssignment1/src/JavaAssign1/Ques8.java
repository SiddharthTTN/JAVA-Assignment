package JavaAssign1;

public class Ques8 {

    StringBuffer str = new StringBuffer("ToTheNewDigital");
    public void removeChar(){
        System.out.println("Original String is : " + str);
        str=str.reverse();

        str.delete(4,9);
        System.out.println("Updated String is : " + str);
    }

}
