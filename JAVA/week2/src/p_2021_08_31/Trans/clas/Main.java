package p_2021_08_31.Trans.clas;

public class Main {
	public static void main(String[] args) {
		
		Trans[] tr = new Trans[4];
		tr[0] = new Subway();
		tr[1] = new Bus();
		tr[2] = new Bicycle();
		tr[3] = new Plain();
		
		for (int i = 0; i < tr.length; i++) {
			tr[i].start();
			tr[i].stop();
		}
		
	}
}
