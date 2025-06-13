package com.myjava.practice.basics.string;

public class StringReplace {
    public static void main(String[] args) {
        String words = "String is immutable object which stores value as byte array.";

        // Remove all spaces
        String noSpaces = words.replace(" ", "");

        System.out.println("Total letters (excluding spaces): " + noSpaces.length());
    }
}
