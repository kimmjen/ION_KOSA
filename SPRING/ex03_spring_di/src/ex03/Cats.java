package ex03;

public class Cats {

	
	private MyCats myCats; // 의존성 주입
	
	// constructor
	public Cats() {} // 디폴트 생성자
	public Cats(MyCats myCats) {
		this.myCats = myCats;
	}

	// set
	public void setMyCats(MyCats myCats) {
		this.myCats = myCats;
	}
	
	// print
	public void catsInfoPrint() {
		System.out.println("--------------");
		System.out.println("냥이 이름:" +myCats.getName());
		System.out.println("냥이 나이:" +myCats.getAge());
		System.out.println("냥이 취미:" +myCats.getHobbys());
		System.out.println("냥이 무게:" +myCats.getWeight());
		System.out.println("냥이 색:" +myCats.getColor());
		System.out.println("--------------");
	}
	
	
}
