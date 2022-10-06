package java_basic;

import java.util.*;

public class ScannerProblem {

	public static void main(String[] args) {

		Scanner sc = 
				new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = 
				sc.nextInt();
		
		sc.nextLine();

		System.out.println("이름을 입력하세요");
		String name =
				sc.nextLine();
		
		
		System.out.println("이름: "+name+" 나이: "+age);
		
		
		sc.close();
		
	}

}
