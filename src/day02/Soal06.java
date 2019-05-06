package day02;

import java.util.Scanner;

public class Soal06 {
	
	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);	
		
		System.out.print("Input : ");
		String kalimat = input.nextLine();
		
		int a = kalimat.length();
		int b = 0;
		for (int i = 0; i < a; i++) {
			if (Character.isUpperCase(kalimat.charAt(i))) {
				b++;
			}
		}
		
		System.out.println("Output : " + b);

	}

}
