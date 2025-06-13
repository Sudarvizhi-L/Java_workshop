package com.myjava.practice.basics.controlstatements;

import java.util.Scanner;

public class TempFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature 1: ");
        float temp1 = scanner.nextFloat();

        System.out.print("Enter temperature 2: ");
        float temp2 = scanner.nextFloat();

        System.out.print("Enter temperature 3: ");
        float temp3 = scanner.nextFloat();

        System.out.print("Enter temperature 4: ");
        float temp4 = scanner.nextFloat();

        System.out.print("Enter temperature 5: ");
        float temp5 = scanner.nextFloat();

        int errors = 0;

        if (temp1 < 18 || temp1 > 28) {
            System.out.println("Error: temperature 1 " +temp1 + " is out of range (should be between 18 and 28)");
            errors = 1;
        }

        if (temp2 < 18 || temp2 > 28) {
            System.out.println("Error: temperature 2 " +temp2 + " is out of range (should be between 18 and 28)");
            errors = 1;
        }
        if (temp3 < 18 || temp3 > 28) {
            System.out.println("Error: temperature 3 " +temp3 + " is out of range (should be between 18 and 28)");
            errors = 1;
        }
        if (temp4 < 18 || temp4 > 28) {
            System.out.println("Error: temperature 4 " +temp4 + " is out of range (should be between 18 and 28)");
            errors = 1;
        }
        if (temp5 < 18 || temp5 > 28) {
            System.out.println("Error: temperature 5 " +temp5 + " is out of range (should be between 18 and 28)");
            errors = 1;
        }

        if (errors == 0) {
            System.out.println("All temperatures are within the safe limit.");
        }

        scanner.close();
    }
}
