package p_2021_08_31.Trans.clas;

public class Plain extends Trans {
	
	String name = "비행기";

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(name + "이 출발합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(name + "이 정지합니다.");
	}

}
