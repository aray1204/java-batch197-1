package day01;

import java.util.Scanner;

public class Soal09 {
	protected static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		input = new Scanner(System.in);
		int sum, temp = 4;
		 
		System.out.println("Input Your Number : ");
		
		int N = Integer.parseInt(input.nextLine());
		
	    for(int i=1 ; i<=N; i++){
	    	
	    	if (i==1) {
	    		System.out.print(temp + "\t");
	    		
	    	} else if (i %3 != 0){
	    		sum = temp * 4;
	    		temp = sum;
	    		System.out.print(sum + "\t");
	    	
	    	} else {
	    		System.out.print( "* \t");
	    		}
	    	}
	    	
		}	
		
}
