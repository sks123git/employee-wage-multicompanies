package com.companies;

public class EmployeeWageMain extends Company {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageMain tataGroup = new EmployeeWageMain();
        EmployeeWageMain birlaGroup = new EmployeeWageMain();
        System.out.println("Total wage tata group: " + tataGroup.dailyWageOfEmployee(30,30,50));
        System.out.println("Total wage birla group: " + birlaGroup.dailyWageOfEmployee(40,30,50));
    }
}