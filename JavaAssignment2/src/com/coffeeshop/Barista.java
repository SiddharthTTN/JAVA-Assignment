package com.coffeeshop;

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
        order.getCustomer().orders();
        order.getCashier().receivesOrder(order.getCustomer(), order.amount);
//        order.getCashier().intimateCustomer(order.getCustomer(),);
        System.out.println(getName() + " took order from queue.");
        this.order = order;
    }

    void preparesCoffee() {
        System.out.println(getName() + " prepared Coffee for " + order.getCustomer().getName());
    }

    void notifyCustomer() {
        System.out.println(getName() + " notifies that Coffee for " + order.getCustomer().getName() + " is ready");
    }
}
