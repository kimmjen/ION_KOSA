package ex02;

public class ScoreImpl implements Score {
	
	private int kor, eng, com;
	
	// constructor
	public ScoreImpl() {
		this(0,0,0);
	}
	
	public ScoreImpl(int kor, int eng, int com) {
		this.kor = kor;
		this.eng = eng;
		this.com = com;
	}
	
	// getter / setter method
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		return kor + eng + com;
	}

	@Override
	public float avg() {
		return total() / 3.0f;
	}

}
