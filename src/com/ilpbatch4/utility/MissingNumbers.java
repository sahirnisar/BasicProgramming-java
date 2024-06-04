package com.ilpbatch4.utility;
public class MissingNumbers {
    public static void main(String[] args) {
        // Set the number and array values
        int number = 10; // Upper limit
        int[] array = {2, 3, 7, 4, 9};       
        //Boolean array to keep track of numbers present in the input array
        boolean present[] = new boolean[number];        
        // Mark the numbers that are present in the array
        for (int i : array) {
            if (i > -10 && i < number) {
                present[i] = true;
            }
        }       
        System.out.println("Missing numbers are:");
        for (int i = 1; i < number; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

