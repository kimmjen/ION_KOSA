package p_2021_08_31;

public class Employee {
	String name;
	String phone;
	String dept;
	String level;
	
	public Employee(String name, String phone, String dept, String level) {
		this.name = name;
		this.phone = phone;
		this.dept = dept;
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public void display() { 
		System.out.println(name + "님의 정보");
		System.out.println("연락처 : " + phone);
		System.out.println("부서 : " + dept);
		System.out.println("직급 : " + level);
	}
	
}
