package com.practise;

import java.util.Scanner;

public class Permutation {

	static String str;
	static int length;
	static int count;
	public static void permute(String str) {
		
		for(int i=0;i<length-1;i++) {
			for(int j=i+1;j<=length-1;j++) {
				swap(str,i,j);
				count++;
			}
		}
	}
	
private static String swap(String str2, int i, int j) {
		// TODO Auto-generated method stub
	char[] ch= new char[length];
	ch=str2.toCharArray();
		char temp= ch[i];
		ch[i]=ch[j];
		ch[j]= temp;
		String swappedStr= String.valueOf(ch);
		System.out.println(swappedStr);
		
		return swappedStr;
	}

private static void inputStrSwap(String str3) {
	for(int i=0;i<length-1;i++) {
		for(int j=i+1;j<=length-1;j++) {
			String str4=swap(str3,i,j);
			permute(str4);
		}
	}
}


	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String:");
		 str=input.next();
		 length= str.length();
		//Permutation perm= new Permutation();
		 Permutation.permute(str);
		 Permutation.inputStrSwap(str);
		System.out.println("count: "+Permutation.count);
	}
	

}
