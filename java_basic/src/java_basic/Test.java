package java_basic;

public class Test {

	static int x = 1;
		
	public static void main(String[] args) {
		
		System.out.println(x+1);
				
		int x = 10; 
		int y = 10; 
		
		System.out.println(x);
				
		int [] ar = {10, 20, 30};
		System.out.println(ar);
		
		/*x = 30;
		
		System.out.println(x);
		
		x = x + 2 ; 
		*/
		System.out.println(x);
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		

	}

}
