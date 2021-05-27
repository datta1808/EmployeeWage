package com.bridgelabz;

public class EmployeeWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int calculateTotalWage(String company, int empRate, int noOfDays, int maxHrs) {
        //variables
        int empHours=0, totalEmpHours = 0, totalWorkingDays = 0;

        //Computation
        while (totalEmpHours <= maxHrs && totalWorkingDays < noOfDays) {
            totalWorkingDays++;
            int empCheck = (int) ((Math.random() * 10) % 3);

            switch (empCheck) {
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
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHours);
        }
        int totalEmpWage = totalEmpHours * empRate;
        System.out.println("Total wage for Company : "+company+" is: " + totalEmpWage);
        return totalEmpWage;
    }



    public static void main(String[] args) {
        calculateTotalWage("Amazon",20, 2, 10);
        calculateTotalWage("flipkart",10, 4, 20);
    }
}