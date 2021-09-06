package p_2021_08_31.Trans.inter;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tran[] tr = new Tran[3];
		
		tr[0] = new Bus();
		tr[1] = new Plain();
		tr[2] = new Subway();
		
		for (int i = 0; i <tr.length; i++) {
			tr[i].start();
			tr[i].stop();
		}
	}

}
