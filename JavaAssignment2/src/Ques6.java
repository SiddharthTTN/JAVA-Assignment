class Ques6 {
    void perform() {
        try {
            int b = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occured");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutofBound Exception Occured");
        } catch (Exception e) {
            System.out.println("Exception Occured");
        } finally {
            System.out.println("Finally block is executed");
        }
    }
}
