package JavaAssign1;

public class Ques6 {
    int arr[] = new int[]{1, 2, 1, 3, 4, 5, 4, 3, 5};


    public void printChar() {
        for (int i = 0; i < arr.length; i++)
        {
            int count=0;
            for(int j=0; j<arr.length;j++)
            {
                if (i==j)
                {
                    continue;
                }

                else if(arr[i]==arr[j])
                {
                    count ++;
                }
            }

            if(count==0)
            {
                System.out.println("The item which is not repeated is : " + arr[i]);
            }


        }
    }
}
