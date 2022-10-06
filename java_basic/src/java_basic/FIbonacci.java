package java_basic;

import java.util.*;

public class FIbonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int fib = sc.nextInt();
		
		int fiboSum = 2;
		
		int f1 = 1;
		int f2 = 1;
		
		int n = 3;
		
		System.out.println(f2);
		System.out.println(f1);
		
		while (n <=fib) {
			
			int f = f1+f2;
			fiboSum = fiboSum+f;
			
			f2 = f1;
			f1 = f;
			
			n = n+1;
			System.out.println(f);
		}
		
		sc.close();
		
		System.out.print(fib+"번째 합은: "+fiboSum);

	}

}
