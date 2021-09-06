package home;

/* P
 * int[] a = {7,5,3,8,2}; 배열의 합 구하는 프로그램 작성
 * A
 * 합은 25
 * */

public class P_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7, 5, 3, 8, 2 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("합은 : " + sum);
	}
}