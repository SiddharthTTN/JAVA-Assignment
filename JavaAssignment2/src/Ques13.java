public class Ques13 extends Exception {
    Ques13(String s) {
        super(s);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }


}
