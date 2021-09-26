package homework.ex01;

public class Student {
	// member variable
	private String name;
	private String group;
	private int grade;

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	// methods
	public void show() {
		System.out.println("이름 : " + name + ", 학년 : " + grade + ", 반 : " + group);
	}
}
