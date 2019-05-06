package day02;

import java.util.Scanner;

public class Soal01{
	protected static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		int temp = 1;
		 
		System.out.print("Input Your Number N1 and N2 = ");
		
		int N1 = input.nextInt();
		int N2 = input.nextInt();
		int realSum = 0;
		int [] deret = new int [N1];
		
		//Print N1
		for(int k = 0 ; k<N1; k++){
			System.out.print(k + "\t");
		}
		//Buat output deret
	    for(int i=1 ; i<=N1; i++){
	    	
	    	if (i==1) {
	    		System.out.println();
	    		System.out.print(temp + "\t");
	    		deret[i-1] = 1;
	    		realSum = temp;
	    		
	    	} else {
	    		temp = temp * 3 ;
	    		//ini buat nanti
	    		deret[i-1] = temp;
	    		//ini skrg
	    		System.out.print(temp + "\t");
	    	}
	    }
	    
	    //buat perhitungan dari deret terpanggil
	    System.out.println();
	    for (int j = 1; j <= N2; j++) {
	    	if (j < N2) {
	    		System.out.print(deret[j-1] + " + ");
				realSum = 1 + deret[j-1];
	    	} else if (j == N2) {
	    		System.out.print(deret[j-1]);
	    		realSum+=deret[j-1];
	    	}
		}
	    
	    //hasil akhir 
	    System.out.println(" = " + realSum);
	    
	}//Main

}//Class
