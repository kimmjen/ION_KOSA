package ex01.ingeritance;

public class Point { // 부모
	protected int x, y;

//	public Point() {
////		this(0, 0);
//		super();
//	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point(int x) {
		this.x = x;
		y = 999;
	}
	// getter setter
	
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
	// output method
	public void disp() {
		System.out.print("x = " + x + ", y = " + y);
	}

}
