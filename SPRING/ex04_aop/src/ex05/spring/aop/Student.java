package ex05.spring.aop;

public class Student implements Print {
	
	private String name, grade, group;
	private int age;
	
	public Student() { }
	

	public Student(String name, String grade, String group, int age) {  // DI
		super();
		this.name = name;
		this.grade = grade;
		this.group = group;
		this.age = age;
	}


	@Override
	public void show() {
		System.out.println("이름 : " +name+", 나이 : "+age +", 학년 : "+grade +", 반: " + group);

	}

}
