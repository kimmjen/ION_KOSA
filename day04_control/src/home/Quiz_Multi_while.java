package home;

public class Quiz_Multi_while {
	public static void main(String[] args) {
		// 2. 전체 구구단 출력
		int i = 2;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.println(i + " * " + j + " = "  + i * j);
				j++;
			}
			i++;
			System.out.println();
		}
	}
}