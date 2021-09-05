package homework;

/*
 * 1. 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ?
 * 2. (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?
 * 3. 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ?
 * */

public class Ass_1 {
	public static void main(String[] args) {
		int tmp1 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		// 과제 1
		for (int i = 1; i <= 5; i++) {
			tmp1 += i;
			sum1 += tmp1;
		}
		System.out.println("과제 1 : " + sum1);
		
		// 과제 2
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) sum2 -= i;
			else sum2 += i;
		}
		System.out.println("과제 2 : " + sum2);
		
		// 과제 3
		for (int i = 2; i <= 10; i++) {
			sum3 += (i - 1 / i);
		}
		System.out.println("과제 3 : " + sum3);
	}
}
