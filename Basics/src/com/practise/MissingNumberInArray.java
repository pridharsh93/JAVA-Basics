package com.practise;

import java.util.Scanner;

/**
 * Java Program To Find Missing Number In An Array : If ‘n’ is the positive
 * number and ‘a’ is an array of integers of length n-1 containing elements from
 * 1 to n. Then find the missing number in ‘a’ in the range from 1 to n.
 * Occurrence of each element is only once. i.e ‘a’ does not contain duplicates.
 * 
 * Example: If n = 8, then array ‘a’ will have 7 elements in the range from 1 to
 * 8. For example {1, 4, 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in
 * this case). You have to find out that missing number.
 * 
 Note : This program should accept all the input values at runtime.
 *
 */
public class MissingNumberInArray {
	
	static int n;
	static int[] a;
	static int missingNumber;
	static int[] sortedArray;
	
	public int[] sort(int[] b) {
		for(int i=0; i<n; i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
				int	temp = a[i];
					a[i]=a[j];
					a[j]= temp;
				}else
				{ a[i]=a[i];
				a[j]= a[j];
				}
				
			}
		}
		
		return a;
	}
	
	public int missingNum(int[] c) {
		//int missingNumber;
		int[] org= new int[n];
		org[0]=a[0];
		for(int i=1;i<n;i++) {
			org[i]=org[0]+i;
		}
		for(int value1: org)
		{System.out.print(value1);
		System.out.println("");}
	
		for(int value: a)
		{System.out.print(value);}
		int i=0;
		while(i<n) {
			if(a[i]==org[i]) {
				i++;
			}
			else {
				 missingNumber= org[i];
				 break;
			}
			
		}return missingNumber;
	}
	
	public static void main(String[] args) {
		MissingNumberInArray mia= new MissingNumberInArray();
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter n value");
		 n= scan.nextInt();
		//MissingNumberInArray.n= 
		 //a.length=n;
		 a= new int[n];
		for(int i=0;i<=(n-1);i++) {
			System.out.println("Enter the "+i+"th term: ");
			a[i]=scan.nextInt();
			
		}for(int value: a)
		{System.out.print(value);}
		System.out.println("");
		sortedArray = mia.sort(a);
		System.out.println("The sorted array:");
		for(int value: a)
		{System.out.print(value);}
		System.out.println("");
		mia.missingNum(sortedArray);
		System.out.println("The missing number is: "+missingNumber);
		
	}
}
