package p_2021_08_31;

public class Sales extends Regular {

	public Sales(String name, String phone, String dept, String level, int sal) {
		super(name, phone, dept, level, sal);
		// TODO Auto-generated constructor stub
	}
	
	public void setup_sal() {
		this.sal = (int) (this.sal * 1.3);
	}
	
	public void display() {
		setup_sal();
		super.display();
	}

}
