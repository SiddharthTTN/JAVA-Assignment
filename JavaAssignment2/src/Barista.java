class Barista extends Cashier {
    private Order order;

    Barista() {
    }

    Order getOrder() {
        return order;
    }

    Barista(String name, int age, Long contact) {
        super(name, age, contact);
    }

    void takeOrder(Order order) {
        System.out.println(getName() + " took order from queue.");
        this.order = order;
    }

    void preparesCoffee() {
        System.out.println(getName() + " prepared Coffee for " + order.getCustomer().getName());
    }

    void nofifyCustomer() {
        System.out.println(getName() + " notifies that Coffee for " + order.getCustomer().getName() + " is ready");
    }
}
