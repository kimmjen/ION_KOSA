package P_2021_08_30;

/*
 * 사각형 클래스 구현
 */
class Point {
	int x, y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void disp() {
		System.out.println("x = " + x + ", y = " + y);
	}
	
}
class Rect extends Point {
	int x1, y1;
	

	public Rect(int x, int y, int x1, int y1) {
		super(x, y);
		this.x1 = x1;
		this.y1 = y1;
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
		System.out.println("x1 = " + x1 + ", y1 = " + y1);
	}
	
}
public class Q_3 {
	public static void main(String[] args) {
//		Point p = new Point(2, 2);
//		p.disp();
		
		Rect r = new Rect(2, 2, 2, 2);
		r.disp();
	}
}
