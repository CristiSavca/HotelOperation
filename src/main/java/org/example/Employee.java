package org.example;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double regularHours = 45;
    private double overtimeHours = 0;
    private double hoursWorked = regularHours + overtimeHours;


    // Constructor
    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked, double overtimeHours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.overtimeHours = overtimeHours;

    }

    // Getters and Setters

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        return payRate * (hoursWorked + overtimeHours);
    }
    public double getOvertimeHours() {
        return overtimeHours;
    }
}