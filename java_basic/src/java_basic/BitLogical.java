package java_basic;

public class BitLogical {

	public static void main(String[] args) {
		
		int a = 11;
		System.out.println(Integer.toBinaryString(a));

		int b = 14;
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println(Integer.toBinaryString(a & b));
		System.out.println(Integer.toBinaryString(a | b));
		System.out.println(Integer.toBinaryString(a ^ b));
		
		int max = a > b ? a : b; 
		System.out.println(max);
		
	}

}
