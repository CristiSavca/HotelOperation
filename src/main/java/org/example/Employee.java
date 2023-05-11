package org.example;

import java.time.LocalTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double regularHours = 45;
    private double overtimeHours = 0;
    private double[] hoursWorked = {regularHours + overtimeHours, 0.00};
    private LocalTime startTime;
    private LocalTime endTime;


    // Constructor
    public Employee(String employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
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

    public String getHoursWorked() {
        return ("Hours: " + hoursWorked[0] + " Minutes: " + hoursWorked[1]);
    }

    public double getTotalPay() {
        return payRate * (hoursWorked[0] + overtimeHours);
    }
    public double getOvertimeHours() {
        return overtimeHours;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked[0] = hoursWorked;
    }

    public void punchIn(LocalTime time){
        this.startTime = time;
    }

    public void punchIn(){
        this.startTime = LocalTime.now();
    }

    public void punchOut(LocalTime time){
        this.endTime = time;
        this.hoursWorked[0] = (endTime.getHour() - startTime.getHour());
        this.hoursWorked[1] = (endTime.getMinute() - startTime.getMinute());
    }

    public void punchOut(){
        this.endTime = LocalTime.now();
        this.hoursWorked[0] = (endTime.getHour() - startTime.getHour());
        this.hoursWorked[1] = (endTime.getMinute() - startTime.getMinute());
    }
}