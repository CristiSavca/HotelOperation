package org.example;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("1234", "Cristi", "AppDev", 45.00);

        e.punchIn(LocalTime.parse("08:00:00"));
        e.punchOut(LocalTime.parse("14:00:00"));

        System.out.println("Hours worked with pre-determined time:");
        System.out.println(e.getHoursWorked());

        System.out.println();

        e.punchOut(); // overloaded method

        System.out.println("Hours worked using current time:");
        System.out.println(e.getHoursWorked());
    }
}