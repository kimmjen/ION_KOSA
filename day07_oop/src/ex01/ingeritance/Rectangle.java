package ex01.ingeritance;

public class Rectangle extends Point{
	int x1, y1;

	public Rectangle(int x, int y, int x1, int y1) {
		super(x, y);
		this.x1 = x1;
		this.y1 = y1;
	}

//	public Rectangle() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

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
		System.out.print(", x1 = " + x1 + ", y1 = " + y1);
	}

}
