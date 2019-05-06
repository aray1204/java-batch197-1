package day02;

import java.util.Scanner;

public class Soal05 {
	protected static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);	
		
		System.out.print("Input : ");
		String kalimat = input.nextLine();
		int a = kalimat.length();
		//String specialChars = "'/*!@#$%^&*()\"{}_[]|\\?/<>,.";
		
		
		for (int i = 0; i < a; i++) {
			if (Character.isUpperCase(kalimat.charAt(i))) {
				System.out.print(kalimat.charAt(i));
			} else if (Character.isWhitespace(kalimat.charAt(i))){
				System.out.print(" ");
			} else if (Character.isLowerCase(kalimat.charAt(i)) && Character.isWhitespace(kalimat.charAt(i+1))){
				System.out.print(kalimat.charAt(i));
			} else if (Character.isLowerCase(kalimat.charAt(i))) {
				System.out.print("*");
			} else {
				System.out.print("");
			}
				
	 
	    }

	}
}
