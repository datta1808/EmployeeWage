package com.bridgelabz;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        final int IS_PRESENT = 1;
        final int WAGE_PER_HOUR = 20;
        int empHours = 0;
        double empCheck = Math.floor((Math.random() * 10) % 2);
        if(empCheck == IS_PRESENT) {
            System.out.println("Employee is present");
            empHours = 8;
        } else {
            System.out.println("Employee is absent");
        }
        int salary = empHours * WAGE_PER_HOUR;
        System.out.println("Employee Salary is: " + salary);
    }
}