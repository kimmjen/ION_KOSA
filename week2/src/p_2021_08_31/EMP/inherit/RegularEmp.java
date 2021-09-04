package p_2021_08_31.EMP.inherit;

public class RegularEmp extends Emp {
	
	private int pay;

	public RegularEmp(String name, String phone, String dept, String rank, int pay) {
		super(name, phone, dept, rank);
		// TODO Auto-generated constructor stub
		this.pay = pay;
	}

	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return 0;
	}

}
