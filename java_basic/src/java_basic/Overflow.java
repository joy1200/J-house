package java_basic;

public class Overflow {

	public static void main(String[] args) {

		long a = 10; 
		
		a = 2200000000L;
		
		System.out.println(a);
		
		char ch = 'A';
		System.out.println(ch);
		
		ch =  97; 
		System.out.println(ch);
		System.out.println(ch+1);

		System.out.println("안녕하세요\n반갑습니다.");
		
		float fl = 10.2524f;
		double dou = 10.242567;
		
		System.out.println(dou);
		System.out.println(fl);
		
		double aa = 1.0;
		double b = 0.2;
		
	
		System.out.println( aa - b);
		
		double result = (double)10/4.0;
		System.out.println(result);
		
		
		byte by = 127;
		by = (byte)(127+1);
		System.out.println(by);
		
		boolean isPan = true;
		
		System.out.println(isPan);
		System.out.println("123".isBlank());
		System.out.println("".isEmpty());
		

		
		
		System.out.println("이름을 입력하세요");
		String name = "홍길동";
		
		System.out.println("나이를 입력하세요");
		int age = 35;
		
		System.out.println("키를 입력하세요");
		double cm = 176.1;
		
		System.out.println("이름:"+name+", 나이:"+age+", 키:"+cm);
	}

}
