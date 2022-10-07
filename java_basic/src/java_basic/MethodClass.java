package java_basic;

public class MethodClass {

		public void threeJava() {
			
			for(int i=0; i<3; i++) {
				System.out.println("Hello Java");
			}
		}
		public void printDisp(int n) {
			
			for(int i=0; i<n; i++) {
				System.out.println("Hello JAVA"+i);
			}
		}
		public void disp(String str, int n) {
			for (int i=0; i<n; i++) {
				System.out.println(str+n);
			}
		}
		
		public void returnMethod(boolean b){
			if (b == false) {
				return;
				
			}
			System.out.println("수행");
		}
				
		
		public void Noreturn(int a, int b) {
			
			int result = a + b;
			
			System.out.println(result);
		}
	
		public int hasReturn (int a,int b) {
			int result = a+b;
			
			System.out.println(result);
			
			return result;
		
			
		}
		
	}


