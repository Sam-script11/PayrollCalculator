package com.pluralsight;

public class Employee {
    private String name;
    private int employeeID;
    private double hoursWorked,payRate;

    public String getName() {
        return this.name;
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

    public double getHoursWorked() {
        return this. hoursWorked;
    }

    public double getPayRate() {
        return this. payRate;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {

        return this.employeeID;
    }

    public Employee(String name, int employeeID, double hoursWorked, double payRate) {
        this.name = name;
        this.employeeID = employeeID;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public  double getGrossPay(){
        return this.hoursWorked * this.payRate;
    }

}
