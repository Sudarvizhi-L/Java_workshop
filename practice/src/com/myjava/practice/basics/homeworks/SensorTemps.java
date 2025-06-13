package com.myjava.practice.basics.homeworks;

import java.util.Scanner;

public class SensorTemps {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter number of sensors: ");
            int numberOfSensors = scanner.nextInt();

            int[] sensorIds = new int[numberOfSensors];
            double[][] sensorTemperatures = new double[numberOfSensors][5];

            for (int sensorIndex = 0; sensorIndex < numberOfSensors; sensorIndex++) {
                System.out.print("Enter Sensor ID for sensor " + (sensorIndex + 1) + ": ");
                sensorIds[sensorIndex] = scanner.nextInt();

                System.out.println("Enter 5 temperature values for Sensor " + sensorIds[sensorIndex] + ":");
                for (int tempIndex = 0; tempIndex < 5; tempIndex++) {
                    System.out.print("Temperature " + (tempIndex + 1) + ": ");
                    sensorTemperatures[sensorIndex][tempIndex] = scanner.nextDouble();
                }
            }

            System.out.println("\n--- Sensor Readings ---");
            for (int sensorIndex = 0; sensorIndex < numberOfSensors; sensorIndex++) {
                for (int tempIndex = 0; tempIndex < 5; tempIndex++) {
                    System.out.println("Sensor " + sensorIds[sensorIndex] + ", temp " + sensorTemperatures[sensorIndex][tempIndex]);
                }
            }
            scanner.close();
        }
}
