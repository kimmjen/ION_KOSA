package ex08.inheritance;

class Point {
	
	protected int x, y;
	
	public Point() {x = y = 10;}
	public Point(int x, int y) {this.x = x; this.y = y; }
	public Point(int x) {this.x = x; }
	public int getX() {	return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {	return y;}
	public void setY(int y) {this.y = y;}
	// 출력함수
	public void disp() {System.out.print("x = " + x + ", y = " + y);
	}
} // point end
class Circle extends Point{ // 상속 - extends
	
	private int r;
//	Point pt; // 상속 사용시
	
	public Circle() {
//		x = y = r = 0;
//		pt = new Point();
//		pt.setX(0);
//		pt.setY(0);
//		r= 0;
	}
	public Circle(int x, int y) {super(x, y); x = y = 100; r = 5;}
	public Circle(int x) {
		super(x);
	}
//	public Circle(int r) {
//		this.r = r;
//	}
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
		
	}
	public int getR() {	return r;}
	public void setR(int r) {this.r = r;}
	public void disp() {
		super.disp(); // 부모(Point)가 갖고 있는 disp() 메소드 호출한 것임.
		System.out.println(" r = " + r);
//		System.out.println("x = " + x + ", y = " + y + ", r = " + r);
	}
	
}// circle end




public class MainEntry {
	public static void main(String[] args) {
		// 사각형 객체 생성해서 출력
		Circle ci = new Circle();
		ci.disp();
		Circle c = new Circle(10, 20);
		c.disp();
		
		
		
		
	}
}
//		Point pt = new Point(1, 2);
//		pt.disp();

