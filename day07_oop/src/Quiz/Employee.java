package Quiz;

public abstract class Employee {
	protected String name;
	protected String number;
	protected String department;
	protected String position;
//	private int salary;

	public Employee() {

	}

	public Employee(String name, String number, String department, String position) {
//		super();
		this.name = name;
		this.number = number;
		this.department = department;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", number=" + number + ", department=" + department + ", position=" + position
//				+ "]";
//	}
	public void disp() {
		System.out.println(name + "\t" + number + "\t" + position + "\t" + department);
	}
	

}
