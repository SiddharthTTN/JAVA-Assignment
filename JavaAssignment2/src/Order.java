public class Order {

    private float amount;
    private Customer customer;
    private Cashier cashier;

    Order(float amount, Customer customer, Cashier cashier) {
        this.amount = amount;
        this.customer = customer;
        this.cashier = cashier;
    }


    public float getAmount() {
        return amount;
    }

    Customer getCustomer() {
        return customer;
    }

    public Cashier getCashier() {
        return cashier;
    }
}
