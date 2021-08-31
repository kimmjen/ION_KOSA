package Q_homework;

public class Sales extends Regular {

	public Sales(String name, String phone, String department, String position, int pay) {
		super(name, phone, department, position, pay);
		// TODO Auto-generated constructor stub
	}
	
	public void Sales() {
		pay = (int)(pay*1.5);
	}
	
	public void disp() {
		Sales();
		super.disp();
	}


}
