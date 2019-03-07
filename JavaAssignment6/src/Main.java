import com.ques1.Singleton;
import com.ques2.Polygon;
import com.ques2.PolygonFactory;
import com.ques3.Car;
import com.ques3.CarFactory;
import com.ques3.CarType;
import com.ques3.Location;
import com.ques4.Student;
import com.ques4.StudentBuilder;
import com.ques5.*;
import com.ques6.*;
import com.ques7.Developer;
import com.ques7.DeveloperDirectory;
import com.ques8.ProxyUser;
import com.ques8.Roles;
import com.ques8.User;


public class Main {
    public static void main(String[] args) {

        //Ques1
        Singleton s1 = Singleton.getInstance();
        System.out.println("");

        //Ques2
        PolygonFactory polygonFactory = new PolygonFactory();
        Polygon polygon1 = polygonFactory.getPolygon(3);
        Polygon polygon2 = polygonFactory.getPolygon(4);
        Polygon polygon3 = polygonFactory.getPolygon(5);
        Polygon polygon4 = polygonFactory.getPolygon(8);
        System.out.println("Its is a: " + polygon1.getType());
        System.out.println("Its is a: " + polygon2.getType());
        System.out.println("Its is a: " + polygon3.getType());
        System.out.println("Its is a: " + polygon4.getType());
        System.out.println("");

        //Ques3
        Car car=CarFactory.buildCar(CarType.SEDAN, Location.USA);
        System.out.println(car);
        System.out.println();


        //Ques4
        Student student1 = new StudentBuilder()
                .setName("Siddharth")
                .setAge(22)
                .setGender('M')
                .setRollNo(1).setPercentage(88)
                .setUsingSchoolTransport(false)
                .build();
        System.out.println(student1);
        Student student2 = new StudentBuilder()
                .setRollNo(2)
                .setName("Gaurav")
                .setAge(22)
                .setGender('M')
                .build();
        System.out.println(student2);
        System.out.println();

        //Ques5
        Shape rectangleRed = new Rectangle(new Red(),"Rectangle");
        Shape rectanglePink = new Rectangle(new Pink(),"Rectangle");
        Shape squareRed = new Rectangle(new Red(),"Square");
        Shape trianglePink = new Rectangle(new Pink(),"Triangle");
        System.out.println(rectangleRed);
        System.out.println(rectanglePink);
        System.out.println(squareRed);
        System.out.println(trianglePink);
        System.out.println();

        //Ques6
        Pizza pizza=new Pizza(new Onions(new Capsicum()));
        pizza.info();
        System.out.println();

        //Ques7
        Developer developer1=new Developer("Siddharth","Java");
        Developer developer2=new Developer("Gaurav","Java");
        DeveloperDirectory developerDirectory=new DeveloperDirectory();
        developerDirectory.addNewDeveloper(developer1);
        developerDirectory.addNewDeveloper(developer2);
        developerDirectory.getDirectories();
        System.out.println();

        //Ques8
        User user2 = new User("Gaurav", Roles.STUDENT);
        User user3 = new User("Yatin", Roles.ADMIN);
        ProxyUser.add(user2);
        ProxyUser.add(user3);
        ProxyUser proxyUser = new ProxyUser("Siddharth", Roles.ADMIN);
        proxyUser.viewUsers();
    }
}
