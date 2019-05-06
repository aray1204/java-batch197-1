package day02;

import java.util.Scanner;

public class Soal04{
	protected static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		int sum, temp = 1;
		 
		System.out.print("Input Your Number N1 and N2 = ");
		
		int N1 = input.nextInt();
		int N2 = input.nextInt();
		int realSum = 0;
		int [] deret = new int [N1];
		
		//Print N1
		for(int k = 0 ; k<N1; k++){
			System.out.print(k + "\t");
		}
		
		System.out.println();
		
		//Buat output deret
	    for(int i=0 ; i<N1; i++){
	    	
	    	if (i%2 == 0) {
	    		
	    		System.out.print(temp + "\t");
	    		temp++;
	    	} else {
	    		if (temp == 2) {
	    			sum = (temp-1) * N2 ;
	    			deret[i] = sum;
		    		System.out.print(sum + "\t");	
	    		} else { 
	    			sum = (temp-1) * N2 ;
	    			deret[i] = sum;
		    		System.out.print(sum + "\t");	
	    		}	    		
	    	}
	    		
	    	
	    }
	    
	    System.out.println();
	    //buat perhitungan dari deret terpanggil
	    for (int j = 1; j <= N1; j++) {
	    	
	    	if (j%2 == 1) {
	    		System.out.print(deret[j] + " + ");
	    		realSum += deret[j];
	    	}	
	    }
	    
	    //hasil akhir 
	    System.out.println(" = " + realSum);
	    
	}//Main

}//Class
