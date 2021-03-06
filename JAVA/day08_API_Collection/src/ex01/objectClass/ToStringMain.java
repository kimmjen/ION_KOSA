package ex01.objectClass;

class Rectangle {
	int x, y; // int : 0, double : 0.0, string : null
	
	public Rectangle() { x=y = 10;}; 
	
	public void disp() {
		System.out.println(x + ", " +  y);
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
//	public String toString() {// toString() override 
//		return x + " ,  "+ y; 
//	}
}
public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
		System.out.println(r); // 해당 객체의 메모리 위치 출력, 123a439b
		System.out.printf("메모리 위치 값 10진수로 표현 : %d\n", 0x123a439b); // 305808283
		System.out.println(r.hashCode());
	}
}
