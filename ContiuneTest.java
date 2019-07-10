package control.loop;

/*
 * 1~100 사이의 홀수의 합을 구하는 클래스
 * for loop continue 활용 
 * continue : 현재 이하 문장 무시
 * 				다음 반복 실행 
 */

public class ContiuneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 선언  	2.초기화
		int num;
		int sum=0;
		
		// 3. 사용
		
		for ( num = 1; num <=100 ; num++) {
			
			if(num %2==0) {
				continue;
			}
			sum += num;
		}
		
		System.out.printf("1~100 사이 홀수의 합 : %d%n ", sum);
		
		// continue ==> if ~ else 변경하면 
		sum = 0;
		
			for ( num = 1; num <=100 ; num++) {
			
			if(num %2==0) {
				
			}else {
				sum += num;
			}
		}
		
			System.out.printf("1~100 사이 홀수의 합 : %d%n ", sum);
		
			// 문제 : 1~100 사이의 3의 배수를 구하시오
			// continue를 사용해서
			
			sum = 0;
			
			for (num = 1 ; num <= 100 ; num++)
			{
				if(num %3 != 0) {
					continue;
					
				}
				sum+=num;
				
			}
			
			System.out.printf("1~100 사이의 3의 배수의 합은  %d%n", sum);
			
		
	}

}
