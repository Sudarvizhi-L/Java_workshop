package com.myjava.practice.basics.loops;

import java.util.Scanner;

public class BuildingFloorZoneCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of buildings: ");
        int noOfBuildings = scanner.nextInt();

        for (int b = 1; b <= noOfBuildings; b++) {
            System.out.print("Enter number of floors in building " + b + ": ");
            int noOfFloors = scanner.nextInt();

            System.out.println("Building " + b);

            for (int f = 0; f < noOfFloors; f++) {
                System.out.println("Floor " + f);

                System.out.print("Enter number of zones in floor " + f + ": ");
                int noOfZones = scanner.nextInt();

                for (int z = 0; z < noOfZones; z++) {
                    System.out.println("Zone " + z);
                }
            }
        }

        scanner.close();
    }
}
