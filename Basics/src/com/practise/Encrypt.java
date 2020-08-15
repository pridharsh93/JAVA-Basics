package com.practise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Encrypt {
	char encryptAlpha;
	char decryptAlpha;
	static char fileAlpha;
	
	char[] alpha= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
			'r','s','t','u','v','w','x','y','z','a','b','c'};
	public char charEncrypt(char fileAlpha) {
		for (int i=0;i<(alpha.length - 1);i++){
			if(fileAlpha==alpha[i]) {
				encryptAlpha= alpha[i+3];
				break;
			}
		}
		return encryptAlpha;
	}
	
	public char charDecrypt(char fileAlpha) {
		Scanner scan= new Scanner(System.in);
		//FileUtils.list(di)
		for (int i=0;i<(alpha.length - 1);i++){
			if(fileAlpha==alpha[i]) {
				decryptAlpha= alpha[i-3];
				break;
			}
		}
		return decryptAlpha;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Encrypt en=new Encrypt();

		try {
		FileReader fr=new FileReader("E:\\file1.txt");
		BufferedReader br= new BufferedReader(fr	);
		int i;
		while((i=br.read())!=-1) {
			fileAlpha=(char)i;
			en.charEncrypt(fileAlpha);		
		}}catch(IOException e) {
			System.out.println("File not found");
		}
		File file2= new File("E:\\file2.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(file2);
			BufferedWriter bw= new BufferedWriter(fw);
			System.out.println("Encrypted alphabet: "+en.encryptAlpha);
			bw.write(en.encryptAlpha);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//File file3= new File("E:\\file3.txt");
		FileReader fr2=new FileReader("E:\\file2.txt");
		BufferedReader br2= new BufferedReader(fr2	);
		int i;
		try {
			while((i=br2.read())!=-1) {
				fileAlpha=(char)i;
				en.charDecrypt(fileAlpha);		
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//en.charDecrypt(en.encryptAlpha);
		System.out.println("Decrypted alphabet: "+en.decryptAlpha);
		File f= new File("E:");
		String[] filenames= new String[20];
		filenames= f.list();

		if(filenames!=null) {
			for(int i1=0;i1<filenames.length;i1++) {
				System.out.println(filenames[i1]);
			}
		}
		}
		


}


