package com.myjava.practice.basics.controlstatements;

import java.util.Scanner;

public class TempSort {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter temperature 1: ");
            float temp = scanner.nextFloat();

            if (temp < 18 || temp > 28) {
                System.out.println("Error: temperature " + temp + " is out of range (should be between 18 and 28)");
            } else {
                if (temp >= 18 && temp <= 20) {
                    System.out.println("Temperature " + temp + " is coolest");
                } else if (temp > 20 && temp <= 24) {
                    System.out.println("Temperature " + temp + " is cooler");
                } else if (temp > 24) {
                    System.out.println("Temperature " + temp + " is cool");
                }
            }

            scanner.close();
        }
}

