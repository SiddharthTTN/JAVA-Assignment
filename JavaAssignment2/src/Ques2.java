import java.util.Arrays;

public class Ques2 {
    String str = "ToTheNew";
    String str1 = str.toLowerCase();
    String[] str3 = str1.split("");
    char[] ch1 = str1.toCharArray();
    char[] ch2 = str1.toCharArray();
    char[] ch3 = new char[ch2.length];
    int a[] = new int[ch2.length];

    public void sortString() {
        System.out.println("Original String : " + str1);
        Arrays.sort(str3);
        String str4 = String.join("", str3);
        System.out.println("Sorted String : " + str4);

        System.out.println("Original String : " + str1);
        Arrays.sort(ch1);
        System.out.println("Sorted String : " + new String(ch1));

        System.out.println("Original String : " + str1);
        for (int i = 0; i < ch1.length; i++) {
            a[i] = (int) ch2[i];
        }
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
        {
            ch3[i] = (char) (a[i]);
        }
        System.out.println("Sorted String : " + new String(ch3));


    }

}
