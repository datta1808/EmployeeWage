package com.bridgelabz;

public class EmployeeWageMain {
    public static void main(String[] args) {
        EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
        employeeWageBuilder.addCompanyEmpWage("Amazon", 18, 18, 90);
        employeeWageBuilder.addCompanyEmpWage("Flipkart", 25, 24, 100);
        employeeWageBuilder.computeEmpWage();
    }
}
