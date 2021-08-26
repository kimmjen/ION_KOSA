package Quiz;
//while 구문 이용해서 구구단 전체 출력
public class Q_MultiWhile {
	public static void main(String[] args) {
		int a = 1, b = 1;
		while (true) {
			b = 1;
			while (true) {
				System.out.println(a + " * " + b + " = " + (a * b));
				b++;
				if (b > 9) {
					break;
				}
			}
			a++;
			if (a > 9) {
				break;
			}
		}
	}
}