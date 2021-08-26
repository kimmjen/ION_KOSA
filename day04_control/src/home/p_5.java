package home;

public class p_5 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (true) {
			if (i > 100)
				break;
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}