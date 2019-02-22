public class Ques13 extends Exception {
    public Ques13(String s){
        super(s);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }


}
