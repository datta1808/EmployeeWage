package com.bridgelabz;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int NO_OF_WORKING_DAYS = 20;

        int empHours = 0;
        int totalSalary = 20;

        for (int day = 1; day <= NO_OF_WORKING_DAYS; day++) {
            int empCheck = (int) ((Math.random() * 10) % 3);

            switch(empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Full Time Employee");
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Part Time Employee");
                    empHours = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    empHours = 0;
            }

            int salary = empHours * WAGE_PER_HOUR;
            System.out.println(salary);
            totalSalary += salary;
        }
        System.out.println("Total wage of Employee is: " + totalSalary);
    }
}