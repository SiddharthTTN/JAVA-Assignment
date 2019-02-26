package assignment.java.oops;

public class Ques5 {
    private int arr[] = new int[]{1, 2, 5, 6, 7, 8, 9};
    private int arr1[] = new int[]{1, 4, 5, 8, 10};

    public void compare() {
        for (int i1 : arr) {
            for (int i : arr1) {
                if (i1 == i) {
                    System.out.print(i1 + "  ");
                }
            }
        }
        System.out.println("are the common elements");
    }

}
