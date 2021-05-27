package com.bridgelabz;

import java.util.ArrayList;

public class EmployeeWageBuilder implements IComputeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private ArrayList<CompanyEmployeeWage> empWageList;

    public EmployeeWageBuilder() {
        empWageList = new ArrayList<>();
    }

    @Override //annotation==>method is overridden in child class
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
        CompanyEmployeeWage empWage = new CompanyEmployeeWage(company, empRatePerHour, numOfWorkingDays, maximumHoursPerMonth);
        empWageList.add(empWage);
    }

    @Override
    public void computeEmpWage() {
        for (int i = 0; i < empWageList.size(); i++) {
            empWageList.get(i).setTotalEmpWage(this.computeEmpWage(empWageList.get(i)));
            System.out.println(empWageList.get(i));
        }

    }

    private int computeEmpWage(CompanyEmployeeWage companyEmployeeWage) {
        int empHours, totalEmpHours = 0, totalWorkingDays = 0;
        while (totalEmpHours <= companyEmployeeWage.maximumHoursPerMonth && totalWorkingDays < companyEmployeeWage.numOfWorkingDays) {
            int check = (int) ((Math.random() * 10) % 3);
            switch (check) {
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }
            totalEmpHours += empHours;
            totalWorkingDays += 1;
        }
        return totalEmpHours * companyEmployeeWage.empRatePerHour;
    }
}