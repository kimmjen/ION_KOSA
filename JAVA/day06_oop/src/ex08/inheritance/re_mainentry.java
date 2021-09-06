package ex08.inheritance;

class Poi {
	private int x, y;
	
	public Poi(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Poi() {
		x = y = 10;
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
		System.out.println("X = " + x + ", Y = " + y);
	}
}
class Reatangle extends Poi {
	private int z, o;
	
	Reatangle(int x, int y, int z, int o) {
		super(z, 0);
		
		this.z = z;
		this.o = o;
	}
	public void disp() {
		super.disp();
		System.out.println("Z = " + z + ", O = " + o);
		
	}
}

public class re_mainentry {
	public static void main(String[] args) {
		Reatangle rea = new Reatangle(2, 2, 4, 4);
		rea.disp();
	}
}
