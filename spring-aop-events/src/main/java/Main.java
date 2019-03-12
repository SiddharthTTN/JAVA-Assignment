import com.Database;
import com.DummyClass;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    private static void testMethod() {
        try {
            throw new IOException();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("IO Exception is Generated");
        }

    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        context.start();

        DummyClass dummyClass = context.getBean(DummyClass.class);
        dummyClass.print();

        Database database = context.getBean(Database.class);
        database.setName("My Database");
        database.setPort(22);
        database.connect();

        context.stop();

        context.close();

        Main.testMethod();
    }
}
