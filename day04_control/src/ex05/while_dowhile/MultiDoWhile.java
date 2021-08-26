package ex05.while_dowhile;

public class MultiDoWhile {

	public static void main(String[] args) {
		int a = 1, b = 1; // 변수 초기화
		
		do {
			do {
				
				System.out.println(b + "\t");
				b++; // 증감식
			} while(b <= 3); // 조건
			
			a++; // 증감
		} while(a <= 2); // 조건
		
	}
}
