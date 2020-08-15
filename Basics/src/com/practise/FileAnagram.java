package com.practise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileAnagram {
	public static String[] inputString;
	public static String pair;
	static String[] pairArray= new String[6];
	String str1, str2;
	
	public  String[] findAnagram(String[] args) {
		
		int n=0;
		//boolean status ;
		for(int i=0;i<args.length-1;i++) {
			for(int j=i+1;j<args.length;j++) {
			str1= args[i];
			str2= args[j];
			str1=str1.replaceAll("//s", "");
			str2=str2.replaceAll("//s", "");
			boolean status = true;  
	        if (str1.length() == str2.length()) {  
	            
	            char[] ArrayS1 = str1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = str2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        
			String temp;
			
			if(status==true) {
				if(str1.compareToIgnoreCase(str2)>0) {
					temp=str1;
					str1=str2;
					str2=temp;
				}pair= new String();
				pair=toString();
				//pairArray.add(pair);
				pairArray[n]=pair;
				n++;
			}
			
			}}
		}
		
		return pairArray;
		
	}
	public String toString() {
		return String.format("{"+str1 + " ," + str2+"}");
	}
	
	public String[] sortAlpha(String[] pairArray){
		String s1,s2, temp;
		
		for(int i=0;i<pairArray.length-1;i++) {
			for(int j=i+1;j<pairArray.length;j++) {
			s1= pairArray[i];
			s2=pairArray[j];
			if(s1!=null&&s2!=null) {
			if(s1.compareToIgnoreCase(s2)>0) {
				temp=pairArray[i];
				pairArray[i]=pairArray[j];
				pairArray[j]=temp;
			}
		}}}
		return pairArray;
	}
	
	public String[] sortLength(String[] pairArray){
		String s1,s2, temp;
		
		for(int i=0;i<pairArray.length-1;i++) {
			for(int j=i+1;j<pairArray.length;j++) {
			s1= pairArray[i];
			s2=pairArray[j];
			if(s1!=null&&s2!=null) {
			char a1= s1.charAt(1);
			char b1= s2.charAt(1);
			int compareChar= Character.compare(a1, b1);
			
			if(compareChar==0) {
				if(s1.length()<s2.length()) {
					temp=pairArray[i];
					pairArray[i]=pairArray[j];
					pairArray[j]=temp;
				}
			}
			}}}
		return pairArray;
	}
	
	public static void main(String[] args) {
		FileAnagram fa= new FileAnagram();
		try {
			File f= new File("E:\\Anagram input.txt");
		BufferedReader bw= new BufferedReader(new FileReader(f));
		char[] ba= new char[(int)f.length()];
		int read;
		int n=0;
		while((read=bw.read())!=-1) {
			//System.out.println((char)read);
			ba[n]=(char)read;
			n++;
		}
		
		String fullString= new String(ba);
		String[] inputString=fullString.split(" ");
		//System.out.println();
		for(int i=0;i<inputString.length;i++) {
			System.out.print(inputString[i]);
		}
		
		fa.findAnagram(inputString);
		System.out.println("----Anagrams----");
		for(int i=0;i<pairArray.length;i++) {
			if(pairArray[i]!=null)
			System.out.print(pairArray[i]);
		}
		
		fa.sortAlpha(pairArray);
		System.out.println("----Alpha sorted Anagrams----");
		for(int i=0;i<pairArray.length;i++) {
			if(pairArray[i]!=null)
			System.out.print(pairArray[i]);
		}
		fa.sortLength(pairArray);
		System.out.println("----Length sorted Anagrams----");
		for(int i=0;i<pairArray.length;i++) {
			if(pairArray[i]!=null)
			System.out.print(pairArray[i]);
		}bw.close();
		}catch(IOException e) {
			System.out.println("File not found");
		}
		//while()
		File f= new File("E:\\output.txt");
		try {
			BufferedWriter bwr= new BufferedWriter(new FileWriter(f));
			for(String str:pairArray) {
			bwr.write(str);
			bwr.newLine();
			}
			bwr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
		
	

}
