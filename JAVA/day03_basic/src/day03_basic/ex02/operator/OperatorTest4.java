package day03_basic.ex02.operator;

public class OperatorTest4 {
	public static void main(String[] args) {
		
		// 관계연산자: < > <= >= == !=
		// 0, 0.0, null을 제외한 모든 것은 참이다.
		
		if (4 < 7) {
			System.out.println("크다");
		} else {
			System.out.println("작다");
		}
		
		if (3 >= 3) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		// 논리연산자 : 2진 논리 ==> 결과: 값, 10진논리 => T,F
		
		int x = 4, y = 7;
		
		System.out.println(x & y); //4
		System.out.println(4 & 7); // 4
		System.out.println(x | y); // 7
		System.out.println(x ^ y); // 3
		
		boolean flag = false; // false(default값)
		
		int a = 10, b = 20, c = 30;
		
		flag = (a < b) && (b < c); // a가 b보다 크고 b가 c보다 작다, '&&'연산은 앞에 '거짓'이면 뒤는 수행 하지 않는다.
		System.out.println(flag); // t
		
		flag = (a > b) && (b > c); 
		System.out.println(flag); // f
		
		flag = (a < b) || (b < c);  // '||'연산은 앞의 것이 '참'이면 뒤는 실행하지 않는다.
		System.out.println(flag); // t
		
		flag = (a > b) || (b > c); 
		System.out.println(flag);// f
	}

}

