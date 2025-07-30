package com.p94_datatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now(); // the current date (yyyy-MM-dd) format
        System.out.println(ld); // 2025-07-30

        LocalTime lt = LocalTime.now(); // the current time hh:mm:ss.nanosec
        System.out.println(lt);

        // will give us the current time and date combined with "T"
        LocalDateTime ltd = LocalDateTime.now();
        System.out.println(ltd); //2025-07-30T14:50:58.107361400
    }
}
