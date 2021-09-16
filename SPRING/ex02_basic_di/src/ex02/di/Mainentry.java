package ex02.di;

public class Mainentry {
	public static void main(String[] args) {
		//객체의 생성이 서로 독립적
		//필요시 객체 주소만 주입
		NewRecordView view = new NewRecordView();
		NewRecord record = new NewRecord(1,2,3,4);
		
		view.setRecord(record);
		view.print();
		
	}
}
