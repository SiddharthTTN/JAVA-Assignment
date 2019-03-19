package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

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

        UserDAO userDAO = (UserDAO) context.getBean("userDAO");
        userDAO.printUserNames();
    }

}
