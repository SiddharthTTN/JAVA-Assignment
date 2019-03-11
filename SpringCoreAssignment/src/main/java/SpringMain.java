import com.SpringConfiguration;
import com.ques3.HotDrink;
import com.ques3.Restaurant;
import com.ques5.Complex;
import com.test.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Config.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        Triangle triangle = context.getBean("triangle", Triangle.class);
//        System.out.println(ctx.getBean(Triangle.class)); //If only one object is present
//        System.out.println(ctx.getBean("triangle"));
//        System.out.println(ctx.getBean("triangle1"));
//        System.out.println(ctx.getBean("triangle2"));

        //Ques1-- Done in Configuration file

        //Ques2
        System.out.println(ctx.getBean("database1"));
        System.out.println(ctx.getBean("database2"));
        System.out.println();

        //Ques3
        HotDrink tea = (HotDrink) ctx.getBean("tea");
        HotDrink expressTea = (HotDrink) ctx.getBean("expressTea");
        tea.prepareHotDrink();
        expressTea.prepareHotDrink();
        System.out.println(ctx.getBean("teaRestaurant"));
        System.out.println(ctx.getBean("teaRestaurant"));
        Restaurant restaurant= (Restaurant) ctx.getBean("teaRestaurant");
        System.out.println(ctx.getBean("teaRestaurantAlias"));
        System.out.println();

        //Ques5
        Complex complex = (Complex) ctx.getBean("complexBean");
        System.out.println(complex.list);
        System.out.println(complex.set);
        System.out.println(complex.map);
        System.out.println();


    }
}
