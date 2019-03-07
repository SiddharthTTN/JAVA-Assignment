package demo.service

import demo.domain.Order
import org.junit.Ignore
import spock.lang.Specification
import spock.lang.Unroll

class EmailServiceSpec extends Specification {
    @Unroll
    def "Check whether the email is sent or not"() {
        given:
        Order order = new Order()
        EmailService emailService = EmailService.getInstance();

        and: "Initializing order"
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400)
        when:
        emailService.sendEmail(order)

        then:
        thrown(RuntimeException)
    }

    @Unroll
    def "Testing send email status"() {
        given:
        Order order = new Order()
        EmailService emailService = EmailService.getInstance();
        String cc = "siddharth5797@gmail.com"

        and: "Initializing order"
        order.setItemName("Product Name")
                .setQuantity(2)
                .setPrice(2400)

        expect:
        emailService.sendEmail(order,cc)

    }
}
