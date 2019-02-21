public class Ques4 {
    private static final Ques4 SINGLE_INSTANCE = new Ques4();

    private Ques4() {}

    public static Ques4 getInstance() {

        System.out.println("Only one object can be created namly : " + SINGLE_INSTANCE.toString());
        return SINGLE_INSTANCE;

    }

    @Override
    public String toString() {
        return "Ques4{}";
    }
}
