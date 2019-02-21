package JavaAssign1;

import java.util.Arrays;

public class Ques5 {
    int arr[]=new int[]{1,2,5,6,7,8,9};
    int arr1[]=new int[]{1,4,5,8,10};
    public void compare()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr[i]==arr1[j])
                {
                    System.out.print(arr[i] + "  ");
                }
            }
        }
        System.out.println("are the common elements");
    }

}
