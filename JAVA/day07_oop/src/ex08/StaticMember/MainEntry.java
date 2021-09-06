package ex08.StaticMember;

// static member

class Atm {
	int count;//instance member
	static int total; // static member
	
	public Atm(int amount) { // default 생성자 // constructor method 생성자 함수
		// TODO Auto-generated constructor stub
		count += amount;
		total += amount;
	}
	
	// static memeber 함수에서는 일반 멤버 변수 사용 x
	// Cannot make a static reference to the non-static field count
	public static void view() {
		total = total + 100;
//		count = count + 100;
	}
	// static member 함수에서는 this 사용 불가
	
	public static void show(int count, int total) {
//		this.count = count; // 세팅
//		this.total = total;
	}
	
	public void display() {
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
	
}// Atm end

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display(); // count : 1000, total : 1000
		System.out.println("--------------------");
		
		Atm at2 = new Atm(1000);
		at2.display(); // count : 1000m total : 2000
		System.out.println("--------------------");
		
		Atm at3 = new Atm(1000);
		at3.display(); // count : 1000m total : 3000
		System.out.println("--------------------");
		
	}
}
