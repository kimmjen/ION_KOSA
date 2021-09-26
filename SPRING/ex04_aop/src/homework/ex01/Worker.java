package homework.ex01;

public class Worker {
	// member variable
	private String name;
	private String dept;
	private String grade;

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// methods
	public void show() {
		System.out.println("이름 : " + name + ", 부서 : " + dept + ", 직급 : " + grade);
	}
}
