package day03_basic.ex01.dataType;

public class MainEntry {
	public static void main(String[] args) {
		
		int x = 9;
		long y = 8;
		
		System.out.println(x); // 4byte 정수데이터
		System.out.println(100); // int
		System.out.println(y); // 8byte long 데이터
		
		short sh = 100; // -32,768 ~ 32,767
		int iNum = 50000; // -21억 ~ 21억
		int iiNum = -32768;
		
		System.out.println(sh);
		System.out.println(iNum);
		System.out.println(iiNum);
		
//		iNum = sh; // int = short, 묵시적 형변환: 작은데이터가 큰 데이터형으로 자동형 변환이 일어난다.
		// sh = iNum // short = int cannot convert into short
//		sh = (short)iNum // short = int 명시적 형변환: 큰데이터형을 작은 데이터형으로 변환할 때, 데이터 손실 발생
		double d = 12.34;
//		float f = 12.34; //연산자 우선순위 오류
		
		int a, b, c; // 지역변수는 반드시 초기화가 되어 있어야한다.
//		System.out.println(a); // 
	}
	
}
