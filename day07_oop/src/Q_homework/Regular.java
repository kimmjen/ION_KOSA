package Q_homework;


// 일반직

public class Regular extends Employee{
	
	int pay;

	public Regular(String name, String phone, String department, String position, int pay) {
		super(name, phone, department, position);
		// TODO Auto-generated constructor stub
		this.pay = pay;
	}
	
	public void disp() {
		super.disp(); // employee 
		System.out.println("급여 : " + pay + "원");
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	

}
