public class Cashier {


    private String name;
    private int age;
    private Long contact;

    Cashier(String name, int age, Long contact) {
        this.age = age;
        this.contact = contact;
        this.name = name;
    }

    Cashier() {
    }

    public String getName() {
        return name;
    }

    Order receivesOrder(Customer customer, float amount) {
        System.out.println(this.getName() + " receives an order from " + customer.getName() + " of Rs." + amount);
        return new Order(amount, customer, this);
    }

    void intimateCustomer(Customer customer) {
        System.out.println(customer.getName() + " has to wait with current token : ");
    }
}
