public class Cashier {

    String name;
    int age;
    Long contact;
    public Cashier(String name, int age, Long contact) {
        this.age=age;
        this.contact=contact;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    Order receivesOrder(Customer customer, float amount) {
        System.out.println(this.getName() + " receives an order from " + customer.getName() + " of Rs." + amount);
        Order order = new Order(amount, customer, this);
        return order;
    }

    void intimateCustomer(Customer customer) {
        System.out.println(customer.getName() + " has to wait with current token : ");
    }
}
