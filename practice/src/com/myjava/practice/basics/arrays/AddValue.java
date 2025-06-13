package com.myjava.practice.basics.arrays;

import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String floatString = "1.2 3.4 5.6 7.8 9.0";
        String[] parts = floatString.split(" ");
        int length = parts.length;

        float[] floatArray = new float[length];
        for (int i = 0; i < length; i++) {
            floatArray[i] = Float.parseFloat(parts[i]);
        }

        System.out.println("Enter a string value to convert and insert:");
        String stringValue = scn.nextLine();
        float convertedValue = Float.parseFloat(stringValue);

        System.out.println("Enter position to insert (0 to " + length + "):");
        int position = scn.nextInt();

        float[] newArray = new float[length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = convertedValue;
            } else {
                newArray[i] = floatArray[j];
                j++;
            }
        }

        System.out.println("Updated array:");
        for (float value : newArray) {
            System.out.print(value + " ");
        }

        scn.close();
    }
}
