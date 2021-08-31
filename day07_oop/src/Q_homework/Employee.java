package Q_homework;

// 이름, 연락처, 부서, 직급 
public class Employee {
	String name, phone, department, position;
	
	public Employee(String name, String phone, String department, String position) {
//		super();
		this.name = name;
		this.phone = phone;
		this.department = department;
		this.position = position;
	}
	
	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("연락처 : " + phone);
		System.out.println("부서 : " + department);
		System.out.println("직급 : " + position);
		
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
