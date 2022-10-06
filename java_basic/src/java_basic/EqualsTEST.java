package java_basic;

import java.util.*;

public class EqualsTEST {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디:");
		String id = sc.nextLine();
		
		boolean result = 
				id == "아담";
		
		System.out.println(result);
		
		result = id.equals("아담");
		System.out.println(result);
				
		sc.close();
		
		String [] names = {"아담","류시아","사이다"};
				
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
	}

}
