package demo

//Unit Test case made for Order.Java
import demo.domain.Order
import spock.lang.Specification
import spock.lang.Unroll

class OrderSpec extends Specification {

    @Unroll
    def "Checking for quantity"() {
        given:
        Order order = new Order()

        when: "Setting a quantity with the setter"
        order.setQuantity(quantity)

        then: "Should get the quantity that we have set for the respective order object"
        order.getQuantity() == result

        where:
        quantity | result
        1        | 1
        5        | 5
        3        | 3
    }

    @Unroll
    def "Checking for Item Name"() {
        given:
        Order order = new Order()

        when: "Setting a Name with the constructor"
        order.setItemName(name)

        then: "Should get the name that we have set for the respective order object"
        order.getItemName() == result

        where:
        name      | result
        "Biscuit" | "Biscuit"
        "Chips"   | "Chips"
        "Flour"   | "Flour"
    }

    @Unroll
    def "Checking for Price"() {
        given:
        Order order = new Order()

        when: "Add a Price with the setter"
        order.setPrice(price as double)

        then: "Should get the Price that we have set for the respective order object"
        order.getPrice() == result

        where:
        price   | result
        10.33   | 10.33
        545     | 545.00
        3222.00 | 3222.00
    }

    @Unroll
    def "Checking for Price With Tax"() {
        given:
        Order order = new Order()

        when: "Add a Price With Tax with the setter"
        order.setPriceWithTex(price_with_tax as double)

        then: "Should get the quantiy that we have set for the respective order object"
        order.getPriceWithTex() == result


        where:
        price_with_tax | result
        10.33          | 10.33
        5455           | 5455.00
        3222.00        | 3222.00
    }
}
