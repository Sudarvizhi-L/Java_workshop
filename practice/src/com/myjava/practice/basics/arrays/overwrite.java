package com.myjava.practice.basics.arrays;

public class overwrite {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e","z","t","c"};

        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("c")) {
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j] = null;
            j++;
        }
       // arr[arr.len]
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
