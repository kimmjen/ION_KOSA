package day03_basic.ex02.operator;

public class OperatorTest {
	public static void main(String[] args) {
		
		// ���� ����
		
		int x = 10, y;
		
//		y = x++; // ���Ը���(���Կ���), ���� ����
//		y = ++x; // ����
//		y = --x;
		y = x--;
		System.out.println(x + "," +y);
		
		int a = 10, result;
		result = ~a;
		
		System.out.println(a + ", ��Ʈ����: " + result); // ������ ,-(������+1)
		
	}

}
