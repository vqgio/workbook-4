package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHoursWorked() {
        return Math.min(hoursWorked, 40);
    }
    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0);
    }
    public double getTotalPay() {
        return (getRegularHoursWorked() * payRate) + (getOvertimeHours() + payRate * 1.50);
    }
}
