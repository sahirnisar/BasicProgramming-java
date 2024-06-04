
package com.ilpbatch4.utility;

import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        // initialize array
        int[] array = {1, 2, 3, 4, 1, 6 , 2, 8, 9, 1, 3, 6};
        // Call the method to find and print duplicates
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        int n = array.length;
        boolean foundDuplicates = false;
        
        
        // Sort the array to bring duplicates together
        Arrays.sort(array);

        System.out.println("Duplicate elements and their counts: ");

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && array[i] == array[i + 1]) {
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(array[i] + "repeated " + count + " times");
                foundDuplicates = true;
            }
        }

        if (!foundDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }
}
