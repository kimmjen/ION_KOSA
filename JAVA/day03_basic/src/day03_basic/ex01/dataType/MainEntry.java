package day03_basic.ex01.dataType;

public class MainEntry {
	public static void main(String[] args) {
		
		int x = 9;
		long y = 8;
		
		System.out.println(x); // 4byte ����������
		System.out.println(100); // int
		System.out.println(y); // 8byte long ������
		
		short sh = 100; // -32,768 ~ 32,767
		int iNum = 50000; // -21�� ~ 21��
		int iiNum = -32768;
		
		System.out.println(sh);
		System.out.println(iNum);
		System.out.println(iiNum);
		
//		iNum = sh; // int = short, ������ ����ȯ: ���������Ͱ� ū ������������ �ڵ��� ��ȯ�� �Ͼ��.
		// sh = iNum // short = int cannot convert into short
//		sh = (short)iNum // short = int ����� ����ȯ: ū���������� ���� ������������ ��ȯ�� ��, ������ �ս� �߻�
		double d = 12.34;
//		float f = 12.34; //������ �켱���� ����
		
		int a, b, c; // ���������� �ݵ�� �ʱ�ȭ�� �Ǿ� �־���Ѵ�.
//		System.out.println(a); // 
	}
	
}
