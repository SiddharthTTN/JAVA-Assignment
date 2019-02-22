public class Customer extends Cashier{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void orders() {
        System.out.println(getName() + " places an order.");
    }

    void waits() {
        System.out.println(getName() + " waits for the order.");
    }

    void collectsOrder() {
        System.out.println(getName() + " collects the coffee and enjoys the drink.");
    }
}
