package day03_basic.ex02.operator;

public class OperatorTest3 {
	public static void main(String[] args) {
		
		// shift 연산자: << >> <<<
		int x = 8, y;
		
//		y = x >> 3; // right shift 원래값 / 2 ^ bit수
		y = x << 3;// left shift 원래값
		 
		System.out.println(x + " ==> " + y);
	}

}

