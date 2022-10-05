package java_basic;

public class Nestedif {

	public static void main(String[] args) {

		String id = "admin";
		String pw = "admin1";
				
				if (id == "admin"){
						if (pw =="admin1") {
							System.out.print("로그인 성공");
							}
						else {
							System.out.print("패스워드가 틀립니다");
						}
					
				}else{
					
					System.out.print("존재하지 않는 ID");
					
				}

	}

}
