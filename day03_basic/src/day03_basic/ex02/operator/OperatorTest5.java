package day03_basic.ex02.operator;

public class OperatorTest5 {
	public static void main(String[] args) {
		
		// ���� ���� ������: (����) ? �� : ����;
		
		int x = 30, result, y =5, z = 7;
		
//		result = (x == 3) ? x : 0;
		
		result = (x < y) ? x : (y > z) ? y : z;
		
		System.out.println(result);
		
		// ���� ����(���� ����): = += *= /= <<= >>=
	
		x = 8;
//		y = x + y;
		x += y;
		System.out.println(x);
		
//		x = x * y;
		x *= y;
		System.out.println(x);
		
		x = x + 1;
		x += 1;
		x++;
		
	}

}

