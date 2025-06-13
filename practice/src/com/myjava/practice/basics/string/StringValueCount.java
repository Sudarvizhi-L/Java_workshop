package com.myjava.practice.basics.string;

public class StringValueCount {
    public static void main(String[] args) {
        String words = "hello everyone welcome to my youtube channel";
        char[] letters = words.toCharArray();
        int count = 0;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != ' ') {
                count++;
            }
        }

        System.out.println("Total letters (no spaces): " + count);
    }
}
