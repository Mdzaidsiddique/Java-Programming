package com.p26_jdbc_temp;

import java.sql.*;
import java.util.Scanner;

public class JdbcDemo4 {
    // using statement, dynamically insert values

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the valid roll no : ");
        int roll = sc.nextInt();

        System.out.println("Please enter the valid student name : ");
        String name = sc.next();

        System.out.println("Please enter the valid address : ");
        String address = sc.next();

        System.out.println("Please enter the valid mobile no : ");
        String mobile = sc.next();
        sc.close();
        System.out.println("you have entered : "+roll +", "+name+", "+address+", "+mobile);

        String url = "jdbc:mysql://localhost:3306/jdbcdb";
        String username = "root";
        String pass = "root";

        try(
            Connection connection = DriverManager.getConnection(url, username, pass);
            Statement statement = connection.createStatement();
           ){
            int row = statement.executeUpdate("insert into student values("+roll+",'"+name+"','"+address+"',"+mobile+")");

            if(row>0){
                System.out.println(row+" students inserted successfully");
            }else{
                System.out.println("something went wrong");
            }

            try(
                ResultSet rs = statement.executeQuery("select * from student");
            ){
                while (rs.next()){
                    System.out.println(rs.getInt("roll")+", "+rs.getString("name")+", "+rs.getString("address")+", "+rs.getString("mobile_no"));
                }
            } catch (SQLException e){
                e.printStackTrace(); // not required as outer try-catch handling the exception
            }

        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
