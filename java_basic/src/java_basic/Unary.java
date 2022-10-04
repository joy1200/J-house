package java_basic;

public class Unary {

	public static void main(String[] args) {
		
		int U = 11;
		
		System.out.println(U);
		
		U++;
		
		System.out.println(U);
		System.out.println(U++);
		System.out.println(++U);
		
		int x = 10;
		int y = 4; 
		
		System.out.println(x + y);
		System.out.println(x/y);
		
		byte b1 = 10;
		byte b2 = 4;
		byte result = (byte)(b1/b2);
		
		double d = x / y;
		System.out.println(d);
		
		int money = 32760;
		
		money = (int)(money / 100.0 + 0.5);
		
		System.out.println(money);
		
		money = (money * 100);
		
		System.out.println(money);
		
	
		
	}

}
