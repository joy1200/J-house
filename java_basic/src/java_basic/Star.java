package java_basic;

public class Star {

	public static void main(String[] args) {
		
		
		
		
		
		
		/* for(int j=0; j<5; j++) {
			
			
			for (int i=0; i<-2*j+9; i++) {
														
				String star = "";			

				star = star+"* ";
				
				System.out.print(star);
				
			}


			System.out.println();		
			*/
		

		for(int j=0; j<7; j++) {
					
			if (j<4) {
			for (int i=0; i<+j+1; i++) {
														
				String star =" ";			
				
				star = star + "*";
				
				System.out.print(star);
				
			}	System.out.println();	

					
		}else {
			for (int i=0; i<7-j; i++) {
														
				String star =" ";			
				
				star = star + "*";
				
				
				System.out.print(star);
				
		
				}System.out.println();	
			}
		}		
	
	}
}

	
	
	


