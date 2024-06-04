package com.ilpbatch4.utility;

public class SumOfAlternateNumberPowers {

	public static void main(String[] args) {
		int input = 3;
		System.out.print(sumOfAlternateNumberPowers(input));
	}

	private static int sumOfAlternateNumberPowers(int input) {
		
		int sum = 0;
		int count = 1;
		for(int i=1;i<=input;i++) {
			if(i%2 != 0) {
				sum = sum + sumOfPower(count,i);
				count = count + 2;
				
			}
			else {
				sum = sum - sumOfPower(count,i);
				count = count + 2;
			}
		}
		
		return sum;
	}

	private static int sumOfPower(int count,int i) {
		int cubiccount = count;
		int sumvalue = 1;
		 for(int j=0;j<i;j++) {
			 sumvalue = sumvalue * cubiccount;
		 }
		return sumvalue;
	}

}
