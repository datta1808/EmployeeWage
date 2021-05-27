package com.bridgelabz;

public class EmployeeWageBuilder {
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;
    final int WAGE_PER_HOUR = 20;
    final int NO_OF_WORKING_DAYS = 20;
    final int MAX_WORKING_HOURS = 100;

    public void calculateTotalWage() {
        int empHours, totalEmpHours = 0, totalWorkingDays = 0;

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

    public static void main(String[] args) {
        EmployeeWageBuilder employee = new EmployeeWageBuilder();
        employee.calculateTotalWage();
    }
}