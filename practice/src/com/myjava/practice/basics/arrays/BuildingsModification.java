package com.myjava.practice.basics.arrays;

import java.util.Scanner;

public class BuildingsModification {
    public static void main(String[] args) {
        String [] arr = new String[5];
        arr[0]="a";
        arr[1]="b";
        arr[2]="c";
        arr[3]="d";
        arr[4]="e";

        String [] newArray = new String[5];

        for(int i=0, j=0; i<arr.length;i++){
            if(!arr[i].equals("c")){
                newArray[j] = arr[i];
                j++;
            }
        }
        for(int m = 0;m< newArray.length;m++){
            System.out.println(newArray[m]);
        }
    }
}
