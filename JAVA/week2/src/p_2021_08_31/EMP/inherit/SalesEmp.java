package p_2021_08_31.EMP.inherit;

public class SalesEmp extends RegularEmp {
	
	private int comm;

	public SalesEmp(String name, String phone, String dept, String rank, int pay, int comm) {
		super(name, phone, dept, rank, pay);
		// TODO Auto-generated constructor stub
		this.comm = comm;
	}
	
	public int getPay() {
		return (super.getPay() + comm);
	}

}
