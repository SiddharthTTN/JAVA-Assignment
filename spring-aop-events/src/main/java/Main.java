import com.Database;
import com.DummyClass;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {

    public void testMethod() throws IOException {
        System.out.println();
        throw new IOException();
    }

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        context.start();

        DummyClass dummyClass = context.getBean(DummyClass.class);
        dummyClass.print();

        Database database = context.getBean(Database.class);
        database.setName("My Database");
        database.setPort(22);
        database.connect();

        Main main = context.getBean("main", Main.class);
        main.testMethod();

        context.stop();
        context.close();


    }
}
