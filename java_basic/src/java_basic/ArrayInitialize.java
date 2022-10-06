package java_basic;

public class ArrayInitialize {

	public static void main(String[] args) {

		int [] ar;
		
		ar = new int [3];
		System.out.println(ar[0]);
		System.out.println(ar[2]);
	
		
		double [] br = new double[3];
		
		String [] number = {"1","2","3","4","5"};
		
		System.out.println(number.length);
		
		for (int a=0;a<5;a++) {
		System.out.println(number[a]);	
		}
		
		for (int a=0;a<number.length;a++) {
			System.out.println(number[a]);	
			}
	
	
	}

	
	
}
