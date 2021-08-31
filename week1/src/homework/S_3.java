package homework;

/*
 * 
 * */

public class S_3 {
	public static void main(String[] args) {
		// 별 찍기 3
//     	 *
//	    **
//	   ***
//	  ****
//	 *****

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}