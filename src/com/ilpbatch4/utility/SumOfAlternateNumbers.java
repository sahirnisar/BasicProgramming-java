package com.ilpbatch4.utility;
public class SumOfAlternateNumbers {
	public static void main(String[] args) {
		int input = 6;
		sumOfAlternateNumbers(input);
    }
	private static void sumOfAlternateNumbers(int input) {
		int sum = 0;
		int sumnumber = 1;
		for(int i=0;i<input;i++) {
			if(i%2 == 0) {
				sum =sum + sumnumber;
				sumnumber = sumnumber+2;
			}
			else {
				sum = sum - sumnumber;
				sumnumber = sumnumber +2;
			}
			}
		System.out.print("sum= "+sum);
		}		
	}
