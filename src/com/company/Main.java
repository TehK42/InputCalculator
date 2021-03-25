package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        double average = 0D;
        double count = 0D;

        while(true) {
            boolean isValid = scan.hasNextInt();
            if(isValid) {
                int number = scan.nextInt();
                sum += number;
                count++;
                average = sum / count;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + ((long)Math.round(average)));
                break;
            }
        }
    }
}
