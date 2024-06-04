package com.ilpbatch4.utility;
public class PrintPatternABC123 {
    public static void main(String[] args) {
        int n = 6; 
        printPattern(n);
    }
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Letters part
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }
            // Numbers part
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }
}
