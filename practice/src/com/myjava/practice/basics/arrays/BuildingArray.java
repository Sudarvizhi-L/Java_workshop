package com.myjava.practice.basics.arrays;

import java.util.Arrays;

public class BuildingArray {
    public static void main(String[] args) {
        char buildings[] = new char[5];
        buildings[0] = 'A';
        buildings[1] = 'B';
        buildings[2] = 'C';
        buildings[3] = 'D';
        buildings[4] = 'E';
        System.out.println(buildings);
        char[] buildingCopy = new char[5];

//        char[] buildingCopy = new char[4];
//        for(int x = 0;x<buildings.length;x++){
//            buildingCopy[x] = buildings[x];
//        }
        /**
         * using System.arraycopy
         */
       // System.arraycopy(buildings, 0, buildingCopy,0,buildings.length);
        buildingCopy = Arrays.copyOf(buildings,buildings.length);
        System.out.println(buildingCopy);
    }
}
