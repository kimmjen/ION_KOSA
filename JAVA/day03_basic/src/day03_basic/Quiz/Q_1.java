package day03_basic.Quiz;

public class Q_1 {

	public static void main(String[] args) {
		int pay = 567890;
		
		System.out.println("����" + ": " +  pay / 10000 + "��");
		System.out.println("õ��" + ": " +  (pay % 10000)/1000 + "��");
		System.out.println("���" + ": " +  ((pay % 10000)%1000)/100 + "��");
		System.out.println("�ʿ�" + ": " +  (((pay % 10000)%1000)%100)/10 + "��");
		
		/*
		 *  int pay = 567890;
			int a = pay / 10000;
			pay %= 10000;
			int b = pay / 1000;
			pay %= 1000;
			int c = pay / 100;
			int d = pay % 100 / 10;
			
			System.out.printf("����: %d�� \nõ��: %d�� \n���: %d�� \n�ʿ�: %d��", a, b, c, d);

		 * */
//		System.out.println("���� : " + pay/10000 + "��");
//		pay %= 10000;
//		System.out.println("õ�� : " + pay/1000 + "��");
//		pay %= 1000;
//		System.out.println("��� : " + pay/100 + "��");
//		pay %= 100;
//		System.out.println("���� : " + pay/10 + "��");

	}
	// ���� 56��, õ�� 7��, ��� 8��, �ʿ� 9��
//	int pay = 567890;
	
}
