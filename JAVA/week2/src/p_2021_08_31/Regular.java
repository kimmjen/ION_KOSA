package p_2021_08_31;

public class Regular extends Employee {
	
	int sal;

	public Regular(String name, String phone, String dept, String level, int sal) {
		super(name, phone, dept, level);
		// TODO Auto-generated constructor stub
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	public void display() { 
		super.display();
		System.out.println("급여 : " + sal + "원");
	}

}
