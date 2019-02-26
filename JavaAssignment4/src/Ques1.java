import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques1 {
    List<Float> list = new ArrayList<Float>();
    float addNumbers(Float a,Float b,Float c,Float d,Float e){
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        float sum=0F;
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            sum = sum + (float) itr.next();
        }
        return sum;

    }

}
