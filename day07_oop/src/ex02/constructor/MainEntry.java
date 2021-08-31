package ex02.constructor;

public class MainEntry {
	
	/*
	 * @Param args 메인은 아무것도 넘겨 받지 않는다.
	 * @Param x 곱을 구하는 것에 첫번째 정수형 변수
	 * @Param y 곱을 구하는 것에 두번째 정수형 변수
	 * @Param gob 변수는 x와 y의 두정수의 곱을 저장하는 변수
	 */
	public static void main(String[] args) {
		int x, y, gob=1;
		
		char ch = 'A';
		String msg;
		x = 5; y = 10;
		msg = "good morning";
		
		gob = gob(x,y);
		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x + " * " + y + " = " + gob);
	}

	private static int gob(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}

}
