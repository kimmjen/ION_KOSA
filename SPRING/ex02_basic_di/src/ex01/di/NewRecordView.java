package ex01.di;

public class NewRecordView {
	
	private NewRecord record;
	
	public NewRecordView(int kor, int math, int eng, int com) {  // 생성자함수 
		record = new NewRecord(kor, eng, math, com);
	}
	
	public void print() {
		System.out.println(record.total() + " / " + record.avg());
	}
}
