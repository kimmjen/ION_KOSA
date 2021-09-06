package Interface_test;

public class MainEntry {
	public static void main(String[] args) {
		Bus b = new Bus();
		Plane p = new Plane();
		
		b.start();
		b.stop();
		p.start();
		p.stop();
		
		//
		System.out.println("anoter play");
		
		Tran[] tran = new Tran[2];
		tran[0] = new Bus();
		tran[1] = new Plane();
		
		for (int i = 0; i < tran.length; i++) {
			tran[i].start();
			tran[i].stop();
		}
	}

}
