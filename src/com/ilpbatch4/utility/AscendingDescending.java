package com.ilpbatch4.utility;
public class AscendingDescending {
	public static void main(String[] args) {
		int array[] = {210,61,91,533};
		if(array[0]>array[1] && array[0]>array[2] && array[0]>array[3]) {
			System.out.print(array[0]+" ");
			if(array[1]>array[2] && array[1]>array[3]) {
				System.out.print(array[1]+" ");
				if(array[2]>array[3]) {
					System.out.print(array[2]+" ");
					System.out.print(array[3]+" ");
				}
				else {
					System.out.print(array[3]+ " ");
					System.out.print(array[2]+ " ");
				}
			}
			else if(array[2]>array[1] && array[2]>array[3]) {
				System.out.print(array[2]+ " ");
				if(array[1]>array[3]) {
					System.out.print(array[1]+" " );
					System.out.print(array[3]+" " );
				}
				else {
					System.out.print(array[3]+" ");
					System.out.print(array[1]+" ");
				}
			}
			else if(array[1]>array[2] && array[2]<array[3]) {
				
				if(array[1]>array[3]) {
					System.out.print(array[1]+ " ");
					System.out.print(array[3]+" ");
					System.out.print(array[2]+" ");
				}
				else {
					System.out.print(array[3]+" ");
					System.out.print(array[1]+" ");
					System.out.print(array[2]+" ");
				}
			}
            else if(array[3]>array[1] && array[3]>array[2]) {
            	System.out.print(array[3]+" ");
				if(array[1]>array[2]) {
					System.out.print(array[1]+" ");
					System.out.print(array[2]+" ");					
				}
				else {
					System.out.print(array[2]+" ");
					System.out.print(array[1]+" ");				
				}
			}
		}
		
		if(array[1]>array[0] && array[1]>array[2] && array[1]>array[3]) {
			System.out.print(array[1]+" ");
			if(array[0]>array[2] && array[0]>array[3]) {
				System.out.print(array[0]+" ");
				if(array[2]>array[3]) {
					System.out.print(array[2]+" ");
					System.out.print(array[3]+" ");
				}
				else {
					System.out.print(array[3]+ " ");
					System.out.print(array[2]+ " ");
				}
			}
			else if(array[2]>array[0] && array[2]>array[3]) {
				System.out.print(array[2]+ " ");
				if(array[0]>array[3]) {
					System.out.print(array[0]+" " );
					System.out.print(array[3]+" " );
				}
				else {
					System.out.print(array[3]+" ");
					System.out.print(array[0]+" ");
				}
			}
			else if(array[0]>array[2] && array[2]<array[3]) {
				
				if(array[0]>array[3]) {
					System.out.print(array[0]+ " ");
					System.out.print(array[3]+" ");
					System.out.print(array[2]+" ");
				}
				else {
					System.out.print(array[3]+" ");
					System.out.print(array[0]+" ");
					System.out.print(array[2]+" ");
				}
			}
            else if(array[3]>array[0] && array[3]>array[2]) {
            	System.out.print(array[3]+" ");
				if(array[0]>array[2]) {
					System.out.print(array[0]+" ");
					System.out.print(array[2]+" ");					
				}
				else {
					System.out.print(array[2]+" ");
					System.out.print(array[0]+" ");				
				}
			}
		}
		
		
		
		if(array[2]>array[1] && array[2]>array[0] && array[2]>array[3]) {
			System.out.print(array[2]+" ");
			if(array[1]>array[0] && array[1]>array[3]) {
				System.out.print(array[1]+" ");
				if(array[0]>array[3]) {
					System.out.print(array[0]+" ");
					System.out.print(array[3]+" ");
				}
				else {
					System.out.print(array[3]+ " ");
					System.out.print(array[0]+ " ");
				}
			}
			else if(array[0]>array[1] && array[0]>array[3]) {
				System.out.print(array[0]+ " ");
				if(array[1]>array[3]) {
					System.out.print(array[1]+" " );
					System.out.print(array[3]+" " );
				}
				else {
					System.out.print(array[3]+" ");
					System.out.print(array[1]+" ");
				}
			}
			else if(array[1]>array[0] && array[0]<array[3]) {
				
				if(array[1]>array[3]) {
					System.out.print(array[1]+ " ");
					System.out.print(array[3]+" ");
					System.out.print(array[0]+" ");
				}
				else {
					System.out.print(array[3]+" ");
					System.out.print(array[1]+" ");
					System.out.print(array[0]+" ");
				}
			}
            else if(array[3]>array[1] && array[3]>array[0]) {
            	System.out.print(array[3]+" ");
				if(array[1]>array[0]) {
					System.out.print(array[1]+" ");
					System.out.print(array[0]+" ");					
				}
				else {
					System.out.print(array[0]+" ");
					System.out.print(array[1]+" ");				
				}
			}
		}
		if(array[3]>array[1] && array[3]>array[2] && array[3]>array[0]) {
			System.out.print(array[3]+" ");
			if(array[1]>array[2] && array[1]>array[0]) {
				System.out.print(array[1]+" ");
				if(array[2]>array[0]) {
					System.out.print(array[2]+" ");
					System.out.print(array[0]+" ");
				}
				else {
					System.out.print(array[0]+ " ");
					System.out.print(array[2]+ " ");
				}
			}
			else if(array[2]>array[1] && array[2]>array[0]) {
				System.out.print(array[2]+ " ");
				if(array[1]>array[0]) {
					System.out.print(array[1]+" " );
					System.out.print(array[0]+" " );
				}
				else {
					System.out.print(array[0]+" ");
					System.out.print(array[1]+" ");
				}
			}
			else if(array[1]>array[2] && array[2]<array[0]) {
				
				if(array[1]>array[0]) {
					System.out.print(array[1]+ " ");
					System.out.print(array[0]+" ");
					System.out.print(array[2]+" ");
				}
				else {
					System.out.print(array[0]+" ");
					System.out.print(array[1]+" ");
					System.out.print(array[2]+" ");
				}
			}
            else if(array[0]>array[1] && array[0]>array[2]) {
            	System.out.print(array[0]+" ");
				if(array[1]>array[2]) {
					System.out.print(array[1]+" ");
					System.out.print(array[2]+" ");					
				}
				else {
					System.out.print(array[2]+" ");
					System.out.print(array[1]+" ");				
				}
			}
		}
		
		
	}
}
