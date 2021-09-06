package p_2021_08_31;

import java.util.Scanner;

public class Parttime extends Employee {
	
	int sal;

	public Parttime(String name, String phone, String dept, String level) {
		super(name, phone, dept, level);
		// TODO Auto-generated constructor stub
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public void parttimer(int hour, int day) {
		setSal(day * hour * 8500);
	}
	
	public void display() {
		int h = 0;
		int d = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : " );
		h = sc.nextInt();
		System.out.print("며칠 일했나요 : " );
		d = sc.nextInt();
		System.out.println("---------------------------");
		parttimer(h, d);
		super.display();
		System.out.println("알바비 : " + sal +"원");
	}

}
