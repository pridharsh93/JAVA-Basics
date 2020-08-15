package com.practise;

import java.util.Scanner;

//import com.kardz.models.User;

public class errorCheck {
	private char[] encryptedPassword;
	private char[] decryptedPassword;
	
	private char[] alpha= {'x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
			'r','s','t','u','v','w','x','y','z'}; 
	
	public String charEncrypt(String pwd) {
		String pwd1= new String();
		char[] passwordChar=pwd.toLowerCase().toCharArray();
		encryptedPassword= new char[pwd.length()];
		for(int i=0;i<passwordChar.length;i++) {
		for (int j=3;j<(alpha.length);j++){
			if(passwordChar[i]==alpha[j]) 
				encryptedPassword[i]= alpha[j-3];
			
		}}
		pwd1= String.valueOf(encryptedPassword);
		return pwd1;
	}
	public static void main(String[] args) {
		
		errorCheck ec = new errorCheck();
		String pwd="priya";
		String output=ec.charEncrypt(pwd);
		System.out.println("encryptedString "+output);
	
		//MissingNumberInArray mia= new MissingNumberInArray();
		//@SuppressWarnings("resource")
		/*Scanner scan= new Scanner(System.in);
		System.out.println("Enter n value");
		 int n= scan.nextInt();
		//MissingNumberInArray.n= 
		 //a.length=n;
		 int[] a= new int[n];
		for(int i=0;i<=(n-1);i++) {
			System.out.println("Enter the "+i+"th term: ");
			a[i]=scan.nextInt();
			
		}for(int value: a)
			{System.out.print(value);
			System.out.println("");}
		int[] org= new int[n];
		org[0]=a[0];
		for(int i=1;i<n;i++) {
			org[i]=++a[0];
		}
		for(int value1: org)
		{System.out.print(value1);}*/
		/*int num1 = 6;   
		   int num2 = 3;
		   num1 = num1^num2;
		   num2 = num1^num2;
		   num1 = num1^num2;
		   System.out.print("num1 = " + num1 +", num2 = "+num2);
		}*/
		
		

}}
