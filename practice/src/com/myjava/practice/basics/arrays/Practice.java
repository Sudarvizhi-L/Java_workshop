package com.myjava.practice.basics.arrays;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of the buildings" + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\nNames of the buildings are :");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
