package com.myjava.practice.basics.loops;

import java.util.Scanner;

public class BuildingFloorCount {
    public void printFloors(int buildingNumber, int noOfFloors) {
        System.out.println("Building " + buildingNumber );
        for (int i = 0; i < noOfFloors; i++) {
            System.out.println(" - Floor " + i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of buildings: ");
        int noOfBuildings = scanner.nextInt();

        BuildingFloorCount floorCount = new BuildingFloorCount(); // <-- fixed

        for (int b = 1; b <= noOfBuildings; b++) {
            System.out.print("Enter number of floors in building " + b + ": ");
            int noOfFloors = scanner.nextInt();

            floorCount.printFloors(b, noOfFloors);
        }

        scanner.close();
    }
}
