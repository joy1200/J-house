package java_basic;

public class Main {

	public static void main(String[] args) {

		User user1 = new User();
		user1.id = "joy";
		user1.accountNumber = "120";
		user1.balance = 3000;
		
		User.network ="bitcoin";
		user1.network = "etherium";
		
		System.out.println(user1.id+user1.accountNumber+user1.balance);
		
		User user2 = new User();
		user2.id = "itstudy";
		user2.accountNumber = "220";
		user2.balance = 2500;
		
		System.out.println(user2.id+user2.accountNumber+user2.balance);
		
		System.out.println(User.network);
		System.out.println(user1.network);
		System.out.println(user2.network);
		
		int x;
		x = 1;
		System.out.println(x);
		
		User user3 = new User();
		
		System.out.println(user3.id);
		System.out.println(user3.balance);
		
		
		
		//MethodClass.threeJava();
		
		MethodClass methodClass = new MethodClass(); 
		methodClass.threeJava();
		
		
		
		methodClass.printDisp(12);
		
		methodClass.disp("한글", 3);
		
		methodClass.returnMethod(true);
		methodClass.returnMethod(false);
		methodClass.Noreturn(5, 20);
		
		methodClass.hasReturn(10, 20);
		
		int r = methodClass.hasReturn(10, 20);
		
		r= methodClass.hasReturn(r, 30);
		
		
		
		
		
	}

}
