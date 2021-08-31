package Interface_test;

public class Subway implements Tran {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("지하철 출발");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("지하철 정지");
		
	}

}
