package control.loop;

public class F2CTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	  double fah;   // 화씨온도 변수 선언
	  double cel; 	// 섭씨온도 변수 선언 
	  
	  
	  for ( fah = 0 ; fah <=100 ; fah +=10 ) {    // 섭씨온도는 0부터 100 까지 10씩 증가한다.
		   
		  cel = (fah-32)*(5.0/9.0);       // 화씨 -> 섭씨온도로 변환 공식 
		  System.out.printf(" %5.1f  F   =   %5.1f  C%n", fah , cel);    // 출력 
	  }
	
		
		
	}

}