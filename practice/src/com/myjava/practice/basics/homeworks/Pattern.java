package com.myjava.practice.basics.homeworks;

/**
 * Utility class for printing patterns.
 */
public final class Pattern {

    // Private constructor to prevent instantiation
    private Pattern() {
        // No instantiation
    }

    /**
     * Prints a square pattern of asterisks of size n x n.
     *
     * @param n the number of rows and columns
     */
    public static void printPattern(final int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Main method to run the pattern printer.
     *
     * @param args the command-line arguments
     */
    public static void main(final String[] args) {
        final int size = 6;
        printPattern(size);
    }
}
