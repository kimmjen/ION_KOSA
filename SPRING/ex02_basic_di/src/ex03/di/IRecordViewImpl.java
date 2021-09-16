package ex03.di;

import java.util.Scanner;

public class IRecordViewImpl implements IRecordView {
	
	private IRecordImpl record;
	
	// setter 로 주입 받기
	public void setRecord(IRecordImpl record) {
		this.record = record;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("kor : ");
		record.setKor(sc.nextInt());
		
		System.out.print("eng : ");
		record.setEng(sc.nextInt());
		
		System.out.print("math : ");
		record.setMath(sc.nextInt());
	}

	@Override
	public void print() {
		System.out.println("\n\nKor : " + record.getKor());
		System.out.println("Eng : " + record.getEng());
		System.out.println("Math : " + record.getMath());
		System.out.println("Total : " + record.total());
		System.out.println("Avg : " + record.avg());
	}

}
