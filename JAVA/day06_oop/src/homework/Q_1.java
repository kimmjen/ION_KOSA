package homework;

class Q_1 {
	
	String name;
	String level;
	String dept;
	int salary;
	String phone;

	public Q_1(String name, String phone) {
		this.name = name;
		this.phone = phone;
		level = "대리";
		dept = "개발팀";
		salary = 2147483647;
	}

	public Q_1(String name, String dept, String phone) {
		this.name = name;
		this.dept = dept;
		this.phone = phone;
		level = "대리";
		salary = 2147483647;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void display() {
		System.out.print(
				"이름 : " + name + "\n직급 : " + level + "\n부서 : " + dept + "\n월급 : " + salary + "만원\n연락처 : " + phone);
//		System.out.println(
//				"이름 : " + name + "\n직급 : " + level + "\n부서 : " + dept + "\n월급 : " + salary + "만원\n연락처 : " + phone);
	}
	public static void main(String[] args) {
		Q_1 q = new Q_1("kimmjen", "010-0000-0000");
		q.display();
	}

}