public class Ques7 {

    int sec;
    public void calculate(int sec){
        System.out.println("Number of seconds given : " + sec);
        int days=sec/(60*60*24);
        int temp=sec%(60*60*24);
        int hours=temp/(60*60);
        int temp1=temp%(60*60);
        int min=temp1/60;
        int seconds=temp1%60;
        System.out.println("Days : " + days + ", Hours : " + hours + ", Minutes : " + min + ", Seconds : " + seconds );
    }
}
