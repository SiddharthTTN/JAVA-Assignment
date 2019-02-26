package assignment.java.oops;

public class Ques6 {
    int arr[] = new int[]{1};


    public void printChar() {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("The item which is not repeated is : " + arr[i]);
            }


        }
    }
}
