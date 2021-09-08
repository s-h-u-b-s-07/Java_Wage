package com.company;

public class Main {

    public static void main(String[] args) {
        //constant
        int is_full_time = 1;

        //computation
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == 1) {
            System.out.println("EMPLOYEE IS PRESENT");
        } else {
            System.out.println("EMPLOYEE IS ABSENT");
        }
    }
}
