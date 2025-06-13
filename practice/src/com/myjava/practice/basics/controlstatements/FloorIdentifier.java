package com.myjava.practice.basics.controlstatements;

public class FloorIdentifier {
    public void identifyFloorType(int floorNumber){
        if (floorNumber % 2 == 0){
            System.out.println("The floor is even");
        }
        else {
            System.out.println("The floor is not even but odd");
        }

    }

    public static void main(String[] args) {
        FloorIdentifier floorIdentifier = new FloorIdentifier();
        floorIdentifier.identifyFloorType(9);
    }
}
