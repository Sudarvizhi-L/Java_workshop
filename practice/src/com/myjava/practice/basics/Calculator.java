package com.myjava.practice.basics;

import java.util.Scanner;

public class Calculator {
    public void add(int a , int b){
        System.out.println(a+b);
    }
    public void subract(int a, int b){
        System.out.println(a-b);
    }
    public void multiply (int a, int b){
        System.out.println(a*b);
    }
    public void divide (int a, int b){
        System.out.println(a/b);
    }
    public void modulus (int a, int b){
        System.out.println(a%b);
    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        Calculator calculator = new Calculator();
        calculator.add(a,b);
        calculator.subract(a,b);
        calculator.multiply(a,b);
        calculator.divide(a,b);
        calculator.modulus(a,b);
    }
}
