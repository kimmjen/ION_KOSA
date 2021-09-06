package homework;

/*
 * 별찍기 1
 * 
 * */

public class S_1 {
	public static void main(String[] args) {
		// 별 찍기1
//		*
//		**
//		***
//		****
//		*****
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
