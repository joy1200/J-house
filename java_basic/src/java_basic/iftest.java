package java_basic;

public class iftest {

	public static void main(String[] args) {


		int score = 70;
		
		/*
		if (score >= 60) {
			
			System.out.println("합격입니다");	
			
		}
		else { 
			System.out.println("불합격입니다");
		}
		*/
		
		if (score >=80 && score <= 100) {
			System.out.println("우수");
		}
			else if (score >= 60 && score < 80) {
				System.out.println("보통");
			}
				else if (score >= 0 && score < 60){
				System.out.println("노력");	
				}
				 	else {
						System.out.println("잘못된점수");	
				 	}
		

	}

	
	
}
