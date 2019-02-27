public class Ques4 {
    private static Ques4 SINGLE_INSTANCE;

    private Ques4() {
    }

    static void getInstance() {

        synchronized (Ques4.class) {
            if (SINGLE_INSTANCE == null) {
                SINGLE_INSTANCE = new Ques4();
            }
        }
        System.out.println("Only one object can be created namly : " + SINGLE_INSTANCE.toString());

    }

    @Override
    public String toString() {
        return "Ques4{}";
    }
}
