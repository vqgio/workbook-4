package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
        this.startTime = -1;
    }
    public void punchIn(double time) {
        if (startTime != -1) {
            System.out.println(name + "is punched in.");
            return;
        }
        startTime = time;
        System.out.println(name + "punched in at " + time);
    }
    public void punchOut(double time) {
        if (startTime == -1) {
            System.out.println(name + "has not punched in yet..");
            return;
        }
        double workedHours = time - startTime;
        hoursWorked += workedHours;
        startTime = -1;
        System.out.println(name + " punched out at " + time + ", worked " + workedHours + " hours.");
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
