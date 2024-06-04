package com.ilpbatch4.utility;
public class SumOfCubic {
	public static void main(String[] args) {
		int input = 4;
		System.out.print(fibonocciCubicSum(input));
	}
	private static int fibonocciCubicSum(int input) {
		int firstTerm = 1;
		int cubicSumOfTwo = 9;
		if (input == 1) {
			return firstTerm;
		}
		if (input == 2) {
			return cubicSumOfTwo;
		}
		if (input > 2) {
			
			int fibonoccinumber = 3;
			for (int i = 2; i<=input-1; i++) {		
				cubicSumOfTwo = cubicSumOfTwo + (fibonoccinumber*fibonoccinumber*fibonoccinumber);
				fibonoccinumber = fibonoccinumber + i;
			}
		}
		return cubicSumOfTwo;
	}
}
