package Quiz;

public class App {
	public static void main(String[] args) {

		Normal n = new Normal("홍길동", "01000000000", "신입", "미정");
		System.out.println("이름\t연락처\t\t부서\t직급\t");
		n.disp();

	}
}
