package com.bridgelabz;

public class EmployeeWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        int empHours = 0, totalEmpHours = 0, totalWorkingDays = 0;

        while (totalEmpHours <= MAX_WORKING_HOURS && totalWorkingDays < NO_OF_WORKING_DAYS){
            totalWorkingDays++;
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

            totalEmpHours += empHours;
            System.out.println("Total working hours: " +totalEmpHours);
            System.out.println("Total working days: " +totalWorkingDays);
        }
        int totalEmpWage = totalEmpHours * WAGE_PER_HOUR;
        System.out.println("Total wage of Employee is: " + totalEmpWage);
    }
}