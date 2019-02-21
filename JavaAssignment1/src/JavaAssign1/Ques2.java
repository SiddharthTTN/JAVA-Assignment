package JavaAssign1;

import java.util.Arrays;

public class Ques2 {

    String str = "to the new to the new new to to the hello";
    String[] str1 = str.split(" ");
    int val=0;


   public void displayWords() {
       System.out.println("The original String is : " + str.toString());
       Arrays.sort(str1);
        for (int i = 0; i < str1.length; )
        {
            int count=1;
            for (int j = i + 1; j < str1.length; j++)
            {
                if (str1[i].equals(str1[j]))
                {
                    count++;
                    val=j;
                }
                else break;
            }
            System.out.println("Number of occurences of " + str1[i] + " are " + count);
            i=val+1;
        }


    }
}