package kr.edu.kosta;

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

	// getter
	public String getName() {
		return name;
	}

	public String getGroup() {
		return group;
	}

	public int getGrade() {
		return grade;
	}
	// methods
	public void show() {
		System.out.println("이름 : " + name + ", 학년 : " + grade + ", 반 : " + group);
	}
}
