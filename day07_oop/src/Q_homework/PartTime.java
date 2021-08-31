package Q_homework;

import java.util.Scanner;

public class PartTime extends Employee {
	
	int pay;

	public PartTime(String name, String phone, String department, String position) {
		super(name, phone, department, position);
		// TODO Auto-generated constructor stub
	}
	
	public void Cal() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 일 근무 : ");
		int day = sc.nextInt();
		System.out.println("하루 근무 시간 : ");
		int hour = sc.nextInt();
		
		pay = (day*hour)*8500; // 8500 시급
		
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
}
