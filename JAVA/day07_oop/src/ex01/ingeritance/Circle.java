package ex01.ingeritance;

public class Circle extends Point {
	int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	
	public void disp() {
		System.out.println(", r = " + r);
	}
	

}
