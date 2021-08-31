package ex08.inheritance;

class Poin {
	
	protected int x, y;
	
	public Poin() {x = y = 10;}
	public Poin(int x, int y) {this.x = x; this.y = y; }
	public Poin(int x) {this.x = x; }
	public int getX() {	return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {	return y;}
	public void setY(int y) {this.y = y;}
	// 출력함수
	public void disp() {System.out.print("x = " + x + ", y = " + y);
	}
} // point end
class Circl extends Point{ // 상속 - extends
	
	private int r;
//	Point pt; // 상속 사용시
	
	public Circl() {
//		x = y = r = 0;
//		pt = new Point();
//		pt.setX(0);
//		pt.setY(0);
//		r= 0;
	}
	public Circl(int x, int y) {super(x, y); x = y = 100; r = 5;}
	public Circl(int x) {
		super(x);
	}
//	public Circle(int r) {
//		this.r = r;
//	}
	public Circl(int x, int y, int r) {
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
class Rectangle extends Poin {
	private int x1, y1;

	public Rectangle() {
		super();
		this.x1 = 5;
		this.y1 = 8;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}
	
	public void disp() {
		super.disp();
		System.out.println(", x1 : " + x1 + ", y1 : " + y1);
	}
}


public class MainEntry2 {
	public static void main(String[] args) {
		// 사각형 객체 생성해서 출력
		Circl ci = new Circl();
		ci.disp();
		Circl c = new Circl(10, 20);
		c.disp();
		
		Rectangle re = new Rectangle();
		re.disp();
		

		
	}
}
//		Point pt = new Point(1, 2);
//		pt.disp();

