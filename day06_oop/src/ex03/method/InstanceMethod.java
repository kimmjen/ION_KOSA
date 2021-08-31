package ex03.method;

import java.util.Scanner;

/* intance method : 객체 생성하고 사용해야함(메모리상에 할당이 되어야...)
 * 예) Scanner sc = new Scanner(System.in);
 * sc.nextInt(), sc.nextFloat(), sc.nextLine(), ...
 * 
 */
class B {
	int x, y;
	// instance method
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
}

public class InstanceMethod {
	public static void main(String[] args) {
		B b = new B();
		
		b.setData(3, 5);
	}
}
