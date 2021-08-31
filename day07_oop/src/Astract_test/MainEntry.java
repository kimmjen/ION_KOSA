package Astract_test;

public class MainEntry {
	public static void main(String[] args) {
		//1. 각자의 클래스로
		Subway s = new Subway();
		s.show("지하철");
		
		Bus b = new Bus();
		b.show("버스");
		
		Bicycle bi = new Bicycle();
		bi.show("자전거");
		
		Plane p = new Plane();
		p.show("plain");
		
		System.out.println("======================================");
		
		//2.
		Ride s2 = new Subway();
		s2.show("지하철");
		
		Ride b2 = new Bus();
		b2.show("버스");
		
		Ride bi2 = new Bicycle();
		bi2.show("자전거");
		
		Ride p2 = new Plane();
		p2.show("plain");
		
		System.out.println("======================================");
		
		//3.
		Ride[] r3 = new Ride[4];
		r3[0] = new Subway();
		r3[1] = new Bus();
		r3[2] = new Bicycle();
		r3[3] = new Plane();
		
		String[] name = {"Subway", "Bus", "Bicycle", "Plain"};
		
		for (int i = 0; i < r3.length; i++) {
			r3[i].show(name[i]);
		}
	}
}
