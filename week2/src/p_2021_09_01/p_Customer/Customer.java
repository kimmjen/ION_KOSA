package p_2021_09_01.p_Customer;

public class Customer {
	static int cnt = 0;
	String name, address, phone;
	int num;
	
	public Customer(int num, String name, String address, String phone) {
//		super();
		this.num = num;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "이름 = " + name + 
				", 주소 =" + address + 
				", 연락처 =" + phone;
	}
	
}
