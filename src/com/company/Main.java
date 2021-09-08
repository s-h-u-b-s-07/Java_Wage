package com.company;

public class Main {
    public static final int IS_PRT_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    private static int totalEmpwage;

    public static void main(String[] args) {
        // Variables
        int empHrs = 0; int empWage = 0; totalEmpwage = 0;
        //computation
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PRT_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;

            }
            empWage = empHrs * EMP_RATE_HOUR;
            totalEmpwage += empWage;
            System.out.println("Emp Wage:" + empWage);

        }
        System.out.println("total Emp Wage: " + totalEmpwage);
    }

}
