package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeWageBuilder implements IComputeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private ArrayList<CompanyEmployeeWage> empWageList;
    private Map<String, CompanyEmployeeWage> companyToEmpWageMap;

    public EmployeeWageBuilder() {
        empWageList = new ArrayList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    @Override //annotation==>method is overridden in child class
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
        CompanyEmployeeWage empWage = new CompanyEmployeeWage(company, empRatePerHour, numOfWorkingDays, maximumHoursPerMonth);
        empWageList.add(empWage);
        companyToEmpWageMap.put(company, empWage);
    }

    @Override
    public void computeEmpWage() {
        for (int i = 0; i < empWageList.size(); i++) {
//            CompanyEmployeeWage companyEmployeeWage = empWageList.get(i);
            empWageList.get(i).setTotalEmpWage(this.computeEmpWage(empWageList.get(i)));
            System.out.println(empWageList.get(i));
        }
    }

    @Override
    public int getTotalWage(String company) {
        return companyToEmpWageMap.get(company).totalWage;
    }

    private int computeEmpWage(CompanyEmployeeWage companyEmployeeWage) {
        int empHours, totalEmpHours = 0, totalWorkingDays = 0;
        while (totalEmpHours <= companyEmployeeWage.maximumHoursPerMonth && totalWorkingDays < companyEmployeeWage.numOfWorkingDays) {
            int check = (int) (Math.floor(Math.random() * 10) % 3);
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
            System.out.println( "Day# " + totalWorkingDays + "   Emp Hrs " + empHours );
        }
        return totalEmpHours * companyEmployeeWage.empRatePerHour;
    }
}