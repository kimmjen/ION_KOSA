package ex06.oop;


// 접근 지정자: private < default < protected < public
class Point {
	private int x, y; // 메인변수 = int : 0, double,float : 0.0, string : null
	public Point (int x, int y) { // 매개 변수 2개짜리 생성자 함수
		this.x = x;
		this.y = y;
	}
	public Point() { // 매개변수 없는 생성자 함수 - 디폴트 생성자 함수
//		x = y= 100;
//		System.out.println("Point() call");
		this(10, 20); //
		System.out.println("Point() call");
	}
	public Point(int x) { // 매개 변수 1개짜리 생성자 함수
		this(x, 999);
//		this.x = x;
//		y = 999;
	}
	public void setX(int xx) { x = xx; }
	public int getX() { return x;}
	
	public void setY(int yy) { y = yy;}
	public int getY() { return x;}
	
	public void display() {
//		System.out.println(x + " , " + y);
		System.out.println(getX() + ", " + getY());
	}
	
} // point end


public class MainEntry {
	public static void main(String[] args) {
		
		Point pt = new Point(); // 객체생성, 메모리에 할당 생성자함수 자동호출
		pt.display();
//		System.out.println(pt.x + " , " + pt.y);// 초기값 확인
//		pt.x = 9;
//		pt.y = 8;
//		
//		System.out.println(pt.x + " , " + pt.y);
//		
	}
}
