public class Wooden extends Furniture {
    public void stress(Type s) {
        System.out.println("The Stress of Wooden " + s.name() +" is low");
    }
    public void firetest(Type s) {
        System.out.println("Wooden " + s.name()+ " catches fire");
    }
}
