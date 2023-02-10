package com.companies;
// Company class Birla group
public class BirlaGroup {
    public static final int EMP_RATE_PER_HOUR = 40;
    public static final int NO_OF_WORKING_DAYS = 10;
    public static final int NO_OF_WORKING_HOURS = 50;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageMain employee = new EmployeeWageMain();
        System.out.println("Total wage: " + employee.dailyWageOfEmployee(EMP_RATE_PER_HOUR,NO_OF_WORKING_DAYS,NO_OF_WORKING_HOURS));
    }
}
