package com.myjava.practice.basics.homeworks;

import java.util.Scanner;

public class FivesTemps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of sensors: ");
        int noOfSensors = scanner.nextInt();

        System.out.print("Enter number of temperatures per sensor: ");
        int noOfTemps = scanner.nextInt();

        String[] sensorId = new String[noOfSensors];
        String[][] temperature = new String[noOfSensors][noOfTemps];

        for (int sensorIndex = 0; sensorIndex < noOfSensors; sensorIndex++) {
            System.out.print("Enter sensor ID for sensor " + sensorIndex + ": ");
            sensorId[sensorIndex] = scanner.next();

            System.out.println("Enter " + noOfTemps + " temperature values for " + sensorId[sensorIndex] + ":");
            for (int tempIndex = 0; tempIndex < noOfTemps; tempIndex++) {
                System.out.print("Temp " + tempIndex + ": ");
                temperature[sensorIndex][tempIndex] = scanner.next();
            }
        }

        System.out.println("\n--- Sensor Temperature Report ---");
        for (int sensorIndex = 0; sensorIndex < noOfSensors; sensorIndex++) {
            System.out.print(sensorId[sensorIndex]);
            for (int tempIndex = 0; tempIndex < noOfTemps; tempIndex++) {
                System.out.print("," + temperature[sensorIndex][tempIndex]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
