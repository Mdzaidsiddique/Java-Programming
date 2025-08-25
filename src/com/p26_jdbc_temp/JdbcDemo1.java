package com.p26_jdbc_temp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo1 {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        // this will load the driver class and registered with driver manager
        //will work without Class.forName() in modern Java, as long as the driver JAR is present.

        String url = "jdbc:mysql://localhost:3306/jdbcdb"; // default mysql port in 3306 & `jdbcdb` db name

        try{
            Connection connection = DriverManager.getConnection(url, "root", "root");

            System.out.println(connection); //com.mysql.cj.jdbc.ConnectionImpl@1165b38

            connection.close(); // closing the connection

        }catch (SQLException se){
            se.printStackTrace();
        }
    }
}
