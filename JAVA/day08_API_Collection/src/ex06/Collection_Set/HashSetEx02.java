package ex06.Collection_Set;

import java.util.HashSet;
import java.util.Set;

// 객체 생성
class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
//		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);
		if (obj instanceof Person) {
			Person temp =(Person)obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
		
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}
	
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	
	
} // person end

public class HashSetEx02 {
	public static void main(String[] args) {
		Set set = new HashSet();
		Person p = new Person("aa", 10);//
		set.add(p);
		set.add(new Person("홍길동", 20));//
		set.add(new Person("이몽룡", 10));//
		set.add(new Person("변사또", 30));//
		set.add(new Person("이춘향", 20));//
		set.add("happy");
		set.add("Happy");//
		set.add(123);//
		
		System.out.println(set);
	}
}
