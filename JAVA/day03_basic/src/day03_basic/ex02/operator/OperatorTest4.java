package day03_basic.ex02.operator;

public class OperatorTest4 {
	public static void main(String[] args) {
		
		// ���迬����: < > <= >= == !=
		// 0, 0.0, null�� ������ ��� ���� ���̴�.
		
		if (4 < 7) {
			System.out.println("ũ��");
		} else {
			System.out.println("�۴�");
		}
		
		if (3 >= 3) {
			System.out.println("��");
		} else {
			System.out.println("����");
		}
		
		// ���������� : 2�� ���� ==> ���: ��, 10������ => T,F
		
		int x = 4, y = 7;
		
		System.out.println(x & y); //4
		System.out.println(4 & 7); // 4
		System.out.println(x | y); // 7
		System.out.println(x ^ y); // 3
		
		boolean flag = false; // false(default��)
		
		int a = 10, b = 20, c = 30;
		
		flag = (a < b) && (b < c); // a�� b���� ũ�� b�� c���� �۴�, '&&'������ �տ� '����'�̸� �ڴ� ���� ���� �ʴ´�.
		System.out.println(flag); // t
		
		flag = (a > b) && (b > c); 
		System.out.println(flag); // f
		
		flag = (a < b) || (b < c);  // '||'������ ���� ���� '��'�̸� �ڴ� �������� �ʴ´�.
		System.out.println(flag); // t
		
		flag = (a > b) || (b > c); 
		System.out.println(flag);// f
	}

}
