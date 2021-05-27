package com.bridgelabz;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        int empHours = 0;
        double empCheck = Math.floor((Math.random() * 10) % 3);
        if(empCheck == IS_FULL_TIME) {
            System.out.println("Full Time Employee");
            empHours = 8;
        } else if(empCheck == IS_PART_TIME){
            System.out.println("Part Time Employee");
            empHours = 4;
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("Daily Work Hours: " + empHours);
        int salary = empHours * WAGE_PER_HOUR;
        System.out.println("Daily wage of Employee is: " + salary);
    }
}