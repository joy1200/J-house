package java_basic;

public class Matrix {

	public static void main(String[] args) {

		String [][] color = {{"레드","그린","옐로우"},{"블랙","블루","그레이"},{"화이트","핑크"}};
		
		System.out.println(color);
		System.out.println(color.length);
		System.out.println(color[0].length);
		System.out.println(color[1].length);
		System.out.println(color[2].length);
		
		for (String[] imsi:color) {
		
			for (String temp:imsi) {
				
				System.out.print(temp+"\t");
			}
				System.out.println();
		}
	}

}
