package home;

public class p_3 {

	public static void main(String[] args) {
		double sum = 0;
		for (double i = 1; i <= 9; i++) {
			sum += (i / (i + 1));
		}
		System.out.println("1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = " + sum);
	}
}
