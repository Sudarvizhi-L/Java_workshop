package com.myjava.practice.basics.arrays;

import java.util.Scanner;

public class NewOverwrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // clear newline

        String[] arr = new String[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextLine();
        }

        System.out.print("Enter value to remove: ");
        String toRemove = scanner.nextLine();

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(toRemove)) {
                arr[j] = arr[i];
                j++;
            }
        }

        while (j < arr.length) {
            arr[j] = null;
            j++;
        }

        System.out.println("\nFinal Output:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
