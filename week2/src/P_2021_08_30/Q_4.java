package P_2021_08_30;

/*
 * 사원
 */

class Swan {
	String name, position, department, phone;
	int salary;
	
	public Swan() {
		name = "김제민";
		position = "수강생";
		department = "SW";
		phone = "010-0000-0000";
		salary = 200000;
	}
	
	public Swan(String name, String position, String department, String phone, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.department = department;
		this.phone = phone;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void output() {
		System.out.printf("이름 = %s\n직급 = %s\n부서 = %s연락처 = %s\n급여 = %d\n", name, position, department, phone, salary);
	}
	
}

public class Q_4 {
	public static void main(String[] args) {
		Swan s = new Swan();
		s.output();
		
		System.out.println();
		Swan s2 = new Swan("도레미", "인턴", "SW", "010-0000-0000", 1000000);
		s2.output();
	}
}
