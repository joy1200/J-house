package java_basic;

public class Switchtest {

	public static void main(String[] args) {

		/*int x = 1;
		switch (x) {
		
		case 1:
			System.out.println("일");
			int k=10;
			break;
			
		case 2:
			System.out.println(x);
			break;
		}
	*/
		
		int m = 1;
		
		if(m==1) {
			System.out.println("한식");
		}else if (m==2) {
			System.out.println("중식");
		}else if (m==3) {
			System.out.println("기타");
		}else {
			System.out.println("잘못된메뉴");
		}
		
		

		int menu = 1;
		
		switch (menu) {
		
		case 1:
			System.out.println("한식");
			
			break;
			
		case 2:
			System.out.println("중식");
			
			break;
			
		case 3:
			System.out.println("기타");
			
			break;
			
		default:
			System.out.println("잘못된메뉴");
		}
	}

}
