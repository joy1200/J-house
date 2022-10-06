package java_basic;

public class Toggle {

	public static void main(String[] args) {
	
		for(int i=0; i<10; i=i+1) {

			int mod = i % 2;
			
			
			switch (mod) {
			
			case 0:
				System.out.println(i + ": 짝수");
				
				break;
				
			case 1:
				System.out.println(i + ": 홀수");
				
				break;
			}}
			boolean flag = false;
			for(int a=0; a<10000000; a++) {
				System.out.print(a);
				flag = !flag;
				
				if(flag) {
					System.out.println(": 짝수");
				}else {
					System.out.println(": 홀수");
				}
				
			}
				
	}

}
