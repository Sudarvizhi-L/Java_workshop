package com.myjava.practice.basics.string;

public class SplitFindWord {
        public static void main(String[] args) {
            String words = "hello everyone welcome to my youtube channel";

            // Split by space
            String[] parts = words.split(" ");

            // Count words
            System.out.println("Number of words: " + parts.length);
        }
}