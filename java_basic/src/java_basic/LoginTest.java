package java_basic;

public class LoginTest {

	public static void main(String[] args) {

		String id = "java";
		
		
		String passwd = "script";
		
		if (id == "java" && passwd == "script") {
			
			System.out.println("로그인 성공");
		}
			else if (id == "java") {
			
				System.out.println("패스워드가 틀렸습니다");
				}
				else {
					System.out.println("존재하지 않는 ID 입니다");
			}
		
	}

}
