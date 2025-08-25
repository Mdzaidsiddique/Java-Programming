package com.p26_jdbc_temp;

import java.sql.*;

public class JdbcDemo2 {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbcdb";

        Connection connection = null;
        try{
            //get connection
            connection = DriverManager.getConnection(url, "root", "root");

            //create statement
            Statement statement = connection.createStatement();

            // create table
//            statement.executeUpdate("create table classroom (class varchar (10), section varchar(2))");

            // execute statement
            int row = statement.executeUpdate("insert into student values(23, 'zaid', 'aligarh', '1234567890')");

            if(row>0){
                System.out.println(row +" student details has been inserted successfully");
            }else{
                System.out.println("student details not inserted");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{ // close the connection with finally block
                connection.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
