package com.companies;

public class Company {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public int dailyWageOfEmployee(int workingHours,int workingDays,int ratePerHour) {
        int empHrs = 0;
        int totalHrs = 0;
        int totalWage = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < workingDays && totalWorkingDays < workingHours) {
            totalWorkingDays++;
            switch (empCheck()) {
                case IS_PART_TIME: //checking if part-time or not
                    empHrs = 4;
                    break;
                case IS_FULL_TIME: //checking if full time or not
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalHrs+=empHrs;
            System.out.println("Day#: " + totalWorkingDays + " " + "Emp hr: " + totalHrs);
        }
        totalWage = totalHrs * ratePerHour;
        return totalWage;
    }
    public static int empCheck(){   // Random checking employee attendance
        int empCheck = (int) Math.floor((Math.random() * 10) % 3);
        return empCheck;
    }
}
