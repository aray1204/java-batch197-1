package day02;

import java.util.Scanner;

public class Soal02{
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
		for(int k = 1 ; k<=N1; k++){
			System.out.print(k + "\t");
		}
		//Buat output deret
	    for(int i=1 ; i<=N1; i++){
	    	
	    	if (i==1) {
	    		System.out.println();
	    		System.out.print(temp + "\t");
	    		realSum += temp;
	    		deret[i-1] = realSum;
	    		
	    	} else if (i%3 == 0) {
    			sum = temp * 3 ;
	    		temp = sum;
	    		deret[i-1] = temp;
	    		System.out.print(sum*-1 + "\t");
	    		
    		} else {
	    		sum = temp * 3 ;
	    		temp = sum;
	    		deret[i-1] = temp;
	    		System.out.print(sum + "\t");
	    	}
	    }
	    
	    //buat perhitungan dari deret terpanggil
	    System.out.println();
	    for (int j = 1; j <= N2; j++) {
	    	if (j%3 == 0) {
	    		if (j < N2) {
		    		System.out.print("-" + deret[j-1] + " *");
					realSum*=deret[j-1] *-1;
		    	} else if (j == N2) {
		    		System.out.print("-"+ deret[j-1]);
		    		realSum*=deret[j-1] *-1;
		    	}
	    	} else { 
	    		if (j < N2) {
		    		System.out.print(deret[j-1] + " * ");
					realSum*=deret[j-1];
		    	} else if (j == N2) {
		    		System.out.print(deret[j-1]);
		    		realSum*=deret[j-1];
		    	}
	    	}
		}
	    
	    //hasil akhir 
	    System.out.println(" = " + realSum);
	    
	}//Main

}//Class
