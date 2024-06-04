package com.ilpbatch4.utility;
import java.util.Arrays;
public class SumOfPairsEqualtoK {
	    public static int findPairsWithSum(int[] arr, int K) {
	        Arrays.sort(arr); //Sort the array
	        int left = 0;
	        int right = arr.length - 1;
	        int pairCount = 0;

	        // Two pointers approach
	        System.out.println("Pairs with sum " + K + ":");
	        while (left < right) {
	            int currentSum = arr[left] + arr[right];
	            if (currentSum == K) {
	                pairCount++;
	                System.out.println("(" + arr[left] + ", " + arr[right] + ")");
	                left++;
	                right--;
	            } else if (currentSum < K) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	        return pairCount;
	    }
	    public static void main(String[] args) {
	        int[] arr = {2, 5, 7, 1, 6, 3, 9, 5, 4};
	        int K = 11;
	        int pairsCount = findPairsWithSum(arr, K);
	        System.out.println("Number of pairs with sum " + K + ": " + pairsCount);
	    }
	}

