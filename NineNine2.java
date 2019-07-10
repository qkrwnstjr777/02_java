package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 1; j <= 9; j++) {
		      System.out.println("");
		      for (int i = 2; i <= 5; i++) {  // 2단 ~ 5단까지
		        System.out.format("%d X %d = %2d   ", i, j, i * j);
		      }
		    }


		    System.out.println(); // 줄바꿈


		    for (int j = 1; j <= 9; j++) {
		      System.out.println();
		      for (int i = 6; i <= 9; i++) {  // 6단 ~ 9단까지
		        System.out.format("%d X %d = %2d   ", i, j, i * j);
		      }
		    }


		    System.out.println(); // 줄바꿈

		

	}

}
