package ex04.For;
/* for(초기값; 
 * */
public class MainEntry {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello~" + i);
		}
		// 초기값, 증감식은 2개 이상 가능
		int a, b;
		
		for(a = 1, b = 2; a <= 10; a++, b += 2) {
			System.out.println(a);
		}
		// 초기값, 증감식은 생략 가능(단, 조건은 생략하면 무한루프)
		a = 1; b = 2;
		for(; a < 20;) {
			System.out.println(a);
			a++;
			b--;
		}
		System.out.println("-----------------------");
		// 무한 for문
		for(;;) {
			System.out.println("kimmjen");
		}
	}
}
