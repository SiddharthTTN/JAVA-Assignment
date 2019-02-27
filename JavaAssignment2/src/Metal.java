public class Metal extends Furniture {
    public void stress(Type s) {
        System.out.println("The Stress of metal " + s.name() +" is high");
    }

    public void firetest(Type s) {
        System.out.println("Metal " + s.name()+ " Don't catches fire");
    }
}
