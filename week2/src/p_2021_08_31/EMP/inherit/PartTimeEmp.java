package p_2021_08_31.EMP.inherit;

public class PartTimeEmp extends Emp {
	
	private int time;
	private int day;

	public PartTimeEmp(String name, String phone, String dept, String rank, int time, int day) {
		super(name, phone, dept, rank);
		// TODO Auto-generated constructor stub
		this.time = time;
		this.day = day;
	}

	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return (int)((time * day) * 0.85);
	}

}
