package com.practise;

import java.util.Scanner;

/**
 * Java Program To Find All Pairs Of Elements In An Array Whose Sum Is Equal To A Given Number :
 * Ex1:
 * {4, 6, 5, -10, 8, 5, 20}
 * Pairs of elements whose sum is 10
 * 4 + 6 = 10
   5 + 5 = 10
  -10 + 20 = 10
  
  Ex2:
  {4, -5, 9, 11, 25, 13, 12, 8}
  Pairs of elements whose sum is 20
  -5 + 25 = 20
  9 + 11 = 20
  12 + 8 = 20
 *
 Note : This program should accept all the input values at runtime.
 */
public class PairsOfElementsInArray {
		static int sum;
		static int n;
		static int[] a;
		static int givenNum;
		
		public static void pairing(int[] a, int n, int givenNum) {
			for(int i=0;i<n-1;i++) {
				int j=i+1;
				while(j<n) {
					sum= a[i]+a[j];
					if(sum==givenNum) {
						System.out.println("pair:"+a[i]+","+a[j]);
						j++;
					}
					else {
						j++;
					}
				}
				}
				
			}
		
		
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		PairsOfElementsInArray.n= input.nextInt();
		System.out.println("Enter the expected sum value");
		givenNum= input.nextInt();
	a= new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the"+i+"th element");
			a[i]=input.nextInt();
		}
		
		for(int value: a)
		{System.out.print(value+",");}
		System.out.println("");
		
		//System.out.println();
		PairsOfElementsInArray.pairing(a, n, givenNum);
	}

}
