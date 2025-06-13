package com.myjava.practice.basics.string;

public class SplitAndJoin {
    public static void main(String[] args) {
        String words = "String is immutable object which stores value as byte array.";

        // Split by space
        String[] parts = words.split(" ");

        // Join back without any separator
        String joined = String.join("", parts);

        System.out.println("Total letters (no spaces): " + joined.length());
    }
}

