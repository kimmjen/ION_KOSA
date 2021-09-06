package ex02.overload;
// overload Method
public class MainEntry {
	public static void main(String[] args) {
		line("*");
		line();//호출
		line(20, "#");
	}
	public static void line(String str) {
		for (int i = 1; i < 10; i++) {
			System.out.print(str);
		}
	}
	public static void line() { // 정의부
		System.out.println("======================");
	}
	public static void line(int n, String str) {
		for (int i = 1; i <= n; i++) {
			System.out.print(str);
		}
	}

}
