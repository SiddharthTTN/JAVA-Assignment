package com;

import com.model.User;
import com.service.UserDAO;
import com.service.UserDaoRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {

/*        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName).newInstance();
        String connectionString = "jdbc:mysql://localhost:3306/springDemo";
        String username = "root";
        String password = "Qwerty@123";
        Connection connection = DriverManager.getConnection(connectionString, username, password);
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.print(resultSet.getString("name"));
            System.out.print(" | ");
            System.out.println(resultSet.getString("dob"));
        }*/

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        //Without Using JDBC Template
        System.out.println("Printing the Data with datasource only");
        UserDAO userDAO = (UserDAO) context.getBean(UserDAO.class);
        userDAO.printUserNames();
        System.out.println();

        //With Using JDBC Template
        UserDaoRepo userDaoRepo = (UserDaoRepo) context.getBean(UserDaoRepo.class);
        System.out.println("Printing the Data with datasource and JDBCTemplate both");
        System.out.println("Printing the User count :");
        userDaoRepo.userCount();
        System.out.println();

        System.out.println("Printing the required Username :");
        System.out.println(userDaoRepo.getUserName());
        System.out.println();

//        userDaoRepo.insertUser();
        System.out.println("Printing the required user detail :");
        userDaoRepo.queryForMap();
        System.out.println();

        System.out.println("Printing the details of all the users as a list :");
        userDaoRepo.queryForList();
        System.out.println();

        System.out.println("Getting object for User class using the Row Mapper :");
        User user = userDaoRepo.getUser();
        System.out.println(user);
        System.out.println();

        System.out.println("Using Hibernate in spring :");
        userDaoRepo.getCountHibernate();
        System.out.println();


    }

}
