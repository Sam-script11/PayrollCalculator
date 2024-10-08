package com.pluralsight;

public class Employee {
    private String name;
    private int employeeID;
    private float hoursWorked,payRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public Employee(String name, int employeeID, float hoursWorked, float payRate) {
        this.name = name;
        this.employeeID = employeeID;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public static double grossPay(float hoursWorked, float payRate){
        double grossPay = hoursWorked*payRate;
        return grossPay;

    }


}
