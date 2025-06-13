package com.myjava.practice.basics.arrays;

public class BuildingFloor {

    public static void main(String[] args) {
        String [][] buildFloor = {{"a","b","c","d","e"},{"12","22","31","13","22"}};
        int x = buildFloor[0].length;
        for (int i=0; i<x; i++){
            for(int j=0; j<buildFloor[i].length;j++){
                System.out.println(buildFloor[i][j]);
            }
        }
    }
}
