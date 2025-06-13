package com.myjava.practice.basics;

import java.util.Scanner;

public class AverageFinder {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the device id: ");
        String deviceId = scanner.nextLine();

        System.out.print("Enter temperature 1: ");
        float t1 = scanner.nextInt();

        System.out.print("Enter temperature 2: ");
        float t2 = scanner.nextInt();

        System.out.print("Enter temperature 3: ");
        float t3 = scanner.nextInt();

        System.out.print("Enter temperature 4: ");
        float t4 = scanner.nextInt();

        System.out.print("Enter temperature 5: ");
        float t5 = scanner.nextInt();

        float sum = t1 + t2 + t3 + t4 + t5;
        float average = sum / 5;

        System.out.println("The average temperature of "
                + deviceId + " is = " + average);

        scanner.close();
    }
}


