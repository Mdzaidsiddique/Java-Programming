package com.p26_jdbc_temp;

import java.sql.*;

public class JdbcDemo3 {

    public static void main(String[] args) throws ClassNotFoundException {

//        Class.forName("com.mysql.cj.jdbc.Driver"); // optional since java 6+ (JDBC 4)
        String url = "jdbc:mysql://localhost:3306/jdbcdb";
        String username = "root";
        String pass = "root";

//       try with resource - no explicit close() required

        try(
                Connection connection = DriverManager.getConnection(url, username, pass);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from student");
        ) {
           while(resultSet.next()) {
               System.out.println(resultSet.getString("name"));
           }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // no explicit close required
    }
}
