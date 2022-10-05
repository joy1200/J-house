package java_basic;

public class ControlETC {

	public static void main(String[] args) {
		
		int score = 90;
		
		if(score >=60)
		System.out.println("합격");
		else 
		System.out.println("불합격");
		
		
		outer : for (int i=0; i<3; i++) {
			System.out.println("외부 반복문 시작");
			
			for(int j=0; j<3; j++) {
				System.out.println("내부 반복문");
				
				break outer;
				
			}
			System.out.println("외부 반복문 종료");
		}

	}

}
