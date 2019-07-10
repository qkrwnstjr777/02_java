package control.loop;



public class PrintToTenByFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		for ( int idx = 1; idx <=10 ; idx++) {
			
			 System.out.printf("idx= %2d%n",idx);
		}
		
		for (int idx = 10; idx >0; idx--) {
			
			 System.out.printf("idx= %2d%n",idx);
		}
		
		// final 변수 == 상수를 활용한 for loop
		
		final int FROM = 1;
		final int TO = 10;
		
	   for (int idx = FROM; idx <= TO; idx++) {
		   
		   System.out.printf("idx= %2d%n",idx);
	   }
		
		
	   System.out.println("FROM, TO  상수를 사용한 역순 출력 ");
	   
	   for(int idx = TO; idx >= FROM ; idx--) {
		   System.out.printf("idx= %2d%n",idx);
	   }
		
		
	   
	   
	  for ( int idx = FROM-1; idx <TO; idx++) {   
		  
		  System.out.printf("idx= %2d%n",idx);
	  }
	   
		
	}

}
