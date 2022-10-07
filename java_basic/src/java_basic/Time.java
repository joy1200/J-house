package java_basic;

public class Time {

	public static void main(String[] args) {

		
	  long time = System.currentTimeMillis();	

      System.out.println(time);
      
      long year = time / (3600*24*365) / 1000;
       
      
      System.out.print((int)(1970 + year));
      System.out.print("년 ");
      System.out.println();      
      
      long day = time -(year*3600*24*365*1000);
      
      
      double random1 = Math.random();
      double random2 = Math.random();
      
      System.out.println("첫번째수: "+random1);
      System.out.println("두번째수: "+random2);

      
      System.out.println("그 중 작은수: "+Math.min(random1, random2));
      
      
     
      
	}

}
