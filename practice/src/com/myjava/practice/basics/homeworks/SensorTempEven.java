package com.myjava.practice.basics.homeworks;

import java.util.Scanner;

public class SensorTempEven
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of sensors: ");
        int numOfSensors = scanner.nextInt();

        int[] sensorIds = new int[numOfSensors];
        double[] temperatures = new double[numOfSensors];

        // Input
        for (int i = 0; i < numOfSensors; i++) {
            System.out.print("Enter Sensor ID for sensor " + (i + 1) + ": ");
            sensorIds[i] = scanner.nextInt();

            System.out.print("Enter Temperature for Sensor " + sensorIds[i] + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        System.out.println("\nEven Temperatures:");
        for (int i = 0; i < numOfSensors; i++) {
            if (temperatures[i] % 2 == 0) {
                System.out.println("Sensor " + sensorIds[i] + ", temp " + temperatures[i]);
            }
        }

        scanner.close();
    }
}