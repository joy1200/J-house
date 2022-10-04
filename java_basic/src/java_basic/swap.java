package java_basic;

public class swap {

	public static void main(String[] args) {

		int x = 20; 
		int y = 30;
		
		System.out.print("x:"+ x);
		System.out.println(" y:"+ y);
		
		int z = x;
		x = y ;
		y = z ;
		
		System.out.print("x:"+ x);
		System.out.println(" y:"+ y);
		
		
		int time = 99980;
		
		int day = time / 86400;
			
		int hour = (time-(day*86400))/3600;
		
		int min = (time-(day*86400)-(hour*3600))/60;

		int second = time % 60;
				
		
		
		System.out.println(day + "날 "+ hour+"시간 "+ min + "분 " + second + "초");		

	}

}
