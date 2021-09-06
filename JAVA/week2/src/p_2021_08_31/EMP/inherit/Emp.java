package p_2021_08_31.EMP.inherit;

public abstract class Emp {
	
	protected String name, phone, dept, rank;
	protected int pay;
	
	public abstract int getPay();
	
	public Emp() {
		
		this.name = null;
		this.phone = null;
		this.dept = null;
		this.rank = null;
		this.pay = 0;
	}

	public Emp(String name, String phone, String dept, String rank) {
		
		this.name = name;
		this.phone = phone;
		this.dept = dept;
		this.rank = rank;
	}
	
	public void output() {
		System.out.println("고객 사원 정보");
		System.out.println("이름 : " + name +
				"\t번호 : " + phone +
				"\t번호 : " + dept +
				"\t번호 : " + rank +
				"\t번호 : " + getPay() + "만원"
				);
		System.out.println("-----------");
	}
	
}
