package day01;

public class SimpleArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cara 1
		System.out.println(simpleArraySum(new int[] {1,2,3,4,10,11}));
		System.out.println(simpleArraySum(new int[] {10,20,30,40}));
		System.out.println(simpleArraySum(new int[] {9,8,7,6,5}));
		
		//cara 2
		int jumlah1 = simpleArraySum(new int[] {1,2,3,4,10,11});
		System.out.println(jumlah1);
	}
	
	static int simpleArraySum(int[] ar) {
		int hasil = 0;
		for (int i = 0; i < ar.length; i++) {
			hasil+=ar[i]; 
		}
		return hasil;	
	}
	
}

