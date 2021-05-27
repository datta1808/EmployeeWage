package com.bridgelabz;

public class EmployeeWageBuilder implements IComputeWage {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    private int numOfCompany;
    private final CompanyEmployeeWage[] empWageArray;

    public EmployeeWageBuilder() {
        empWageArray = new CompanyEmployeeWage[5];
    }

    @Override //annotation==>method is overridden in child class
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
        empWageArray[numOfCompany] = new CompanyEmployeeWage(company, empRatePerHour, numOfWorkingDays, maximumHoursPerMonth);
        numOfCompany++;
    }

    @Override
    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            empWageArray[i].setTotalEmpWage(this.computeEmpWage(empWageArray[i]));
            System.out.println(empWageArray[i]);
        }

    }

    private int computeEmpWage(CompanyEmployeeWage companyEmpWage) {
        int empHours = 0, totalEmpHours = 0, totalWorkingDays = 0;
        while (totalEmpHours <= companyEmpWage.maximumHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            int check = (int) (Math.floor(Math.random() * 10) % 3);
            switch (check) {
                case isPartTime:
                    empHours = 4;
                    break;
                case isFullTime:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }
            totalEmpHours += empHours;
            totalWorkingDays += 1;
        }
        return totalEmpHours * companyEmpWage.empRatePerHour;

    }
}