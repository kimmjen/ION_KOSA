package p_2021_09_01;

public class Customer {
	int num;
	String name;
	String address;
	String phone;
	
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
	public Customer(int num, String name, String address, String phone) {
//		super();
		this.num = num;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [num=" + num + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	
}
