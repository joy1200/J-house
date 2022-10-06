package java_basic;

public class ExampleTEST {

	public static void main(String[] args) {
		
		
		
		int num1 = 2;
		int num2 = 3;
		
		
		System.out.println("     1");
		
		for (int i=1;i<5;i++) {
			
			for (int j=1;j<6-i;j++) {
			
			String front1 = "";
			front1 = front1+" ";
			System.out.print(front1);
			
			}
			
			System.out.print(num1);
			num1 = num1 + 2;
			
		
			
			for (int h=1;h<2*i;h++){
			
			String front2 = "";
			front2 = front2+" ";
			System.out.print(front2);
			
			}
			System.out.print(num2);
			num2 = num2 + 2;
			System.out.println();
		}
		
		

	}

}
