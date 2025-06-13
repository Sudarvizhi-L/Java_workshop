package com.myjava.practice.basics;

import java.util.Scanner;

public class DeviceValue {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter sensor name: ");
            String varName = scanner.nextLine();

            System.out.printf("Enter temp value for %s%n", varName);
            int value = scanner.nextInt();

            System.out.println(varName + " = " + value);
        }
    }

