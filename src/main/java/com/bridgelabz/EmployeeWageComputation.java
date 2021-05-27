package com.bridgelabz;

public class EmployeeWageComputation {
    //variables
    public final String company;
    public final int empWagePerHour;
    public final int maxHoursAMonth;
    public final int workingDayMonth;
    public int totalEmpWage;

    public EmployeeWageComputation(String company, int empWagePerHour, int maxHoursAMonth, int workingDayMonth) {
        this.company=company;
        this.empWagePerHour=empWagePerHour;
        this.maxHoursAMonth=maxHoursAMonth;
        this.workingDayMonth=workingDayMonth;
    }
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage=totalEmpWage;
    }
    @Override
    public String toString() {
        return "Total employee wage for " + company +" is " + totalEmpWage;
    }
}