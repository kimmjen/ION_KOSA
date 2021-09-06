package home;

/* P
 * 9월의 강수량 평균을 구하는 프로그램 작성(단, 30일 기준)
 * A
 * 2020년 9월 평균 강수량 : 6.05
 * */

public class P_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] rain = { 0, 33.3, 29.8, 0, 0, 6.4, 61.0, 0, 1.3, 3.9, 1.2, 5.7, 0, 0.0, 0, 0.3, 0, 0, 0.3, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 38.3 };
		double sum = 0;
		for (int i = 0; i < 30; i++) {
			sum += rain[i];
		}
		System.out.println("2020년 9월 평균 강수량  : " + (sum / 30));
	}
}
