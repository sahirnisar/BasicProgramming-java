package com.ilpbatch4.utility;
public class PatternZ {
	public static void main(String[] args) {
		int rows = 5;
		zPattern(rows);
	}
	private static void zPattern(int rows) {
//		 mid = rows/2;
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= rows;j++)
			{
				if(i == 1 || i == rows || i + j == rows) {
//				{   if(i== 1 && j==1 || i==rows && j==rows ||  i== 1 && j==rows ||   i== rows && j==1 || i-1 == mid && j == mid) {
//					System.out.print("#");	}
//					else {
			
					System.out.print("*");}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}		
	}
}
 