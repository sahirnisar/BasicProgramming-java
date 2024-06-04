package com.ilpbatch4.utility;

public class DescendingOrder {
	public static void main(String[] args) {
		int input1 = 90, input2 = 24, input3 = 15;
		if (input1 > input2) {
			if (input1 > input3) {
				System.out.print(input1 + " ");
				if (input2 > input3) {
					System.out.print(input2 + " ");
					System.out.print(input3 + " ");
                } else {
					System.out.print(input3 + " ");
					System.out.print(input2 + " ");
				}
			} else {
				System.out.print(input3 + " ");
				System.out.print(input1 + " ");
				System.out.print(input2 + " ");
			}
		} else if (input2 > input3) {
			System.out.print(input2 + " ");
			if (input1 > input3) {
				System.out.print(input1 + " ");
				System.out.print(input3 + " ");
			} else {
				System.out.print(input3 + " ");
				System.out.print(input1 + " ");
			}
		} else {
			System.out.print(input3 + " ");
			System.out.print(input2 + " ");
			System.out.print(input1 + " ");
		}
	}
}
