package ex01.array;

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		char[] ch1; // 선언
		ch1 = new char[4]; // 배열 생성, 메모리 할당
		
		// 2.
		char[] ch2 = new char[4]; // 선언과 동시에 배열생성, 메모리 할당\
		// 배열 초기화
		ch1[0] = 'J';
		ch1[1] = 'A';
		ch1[2] = 'V';
		ch1[3] = 'A';
		
		// 3. 선언과 동시에 초기화
		char[] ch3 = {'J', 'A', 'V', 'A'};
		
		// 배열의 길이(크기)
		System.out.println("배열의 길이(크기) : " + ch3.length);
		System.out.println("=============================");
		
		for (int i = 0; i < 4; i++) {
			System.out.println("ch2[" + i + "] = " + ch2[i]);
		}
		for (int i = 0; i < ch3.length; i++) { // 
			System.out.println("ch3[" + i + "] = " + ch3[i]);
		}
		
		
	}
}
