public class Ques4 {
    private static final Ques4 SINGLE_INSTANCE = new Ques4();

    private Ques4() {}

    public static Ques4 getInstance() {

        System.out.println("Only one object can be created namly");
        return SINGLE_INSTANCE;

    }
}
