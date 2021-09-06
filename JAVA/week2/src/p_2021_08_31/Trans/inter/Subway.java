package p_2021_08_31.Trans.inter;

public class Subway implements Tran {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("지하철이 출발합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("지하철이 정지합니다.");
	}

}
