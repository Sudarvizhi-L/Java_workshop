package com.myjava.practice.basics.loops;

import java.util.Scanner;

public class FloorCount {
    public void print(int noOfFloors){
        for(int i=0;i<noOfFloors;i++){
            System.out.println("floor "+i);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of floors ");
        int floor = scanner.nextInt();

        FloorCount floorCount = new FloorCount();
        floorCount.print(floor);
    }
}
