package java_basic;

public class Dowhile {

	public static void main(String[] args) {
		
		int idx = 0;
		
		do {
			System.out.println(-2 * idx + 10);
			idx = idx + 1;
		}while(idx <6);
		
		
		for (idx=0; idx<5; idx=idx+1); {
			System.out.println("Hello");
		}
		
		
		int a;
		
		int sum = 0;
		for (a=0; a<=10; a++) {
			
			sum = a + sum;			
		
					}
		System.out.println(sum);
		

		int b=0;
		int Sum=0;
		while (b<10) {
			b = b+1;
			Sum = b+Sum;
			
		}
		System.out.println(Sum);
		
		
		
	}

}
