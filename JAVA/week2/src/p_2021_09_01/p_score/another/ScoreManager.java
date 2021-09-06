package p_2021_09_01.p_score.another;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreManager {
	private ArrayList<Score> arr = new ArrayList<Score>();
	Scanner sc = new Scanner(System.in);
	
	public void addScore() {
		Score s = new Score();
		System.out.print("이름 : "); s.setName(sc.next());
		System.out.print("국어 : "); s.setKor(sc.nextInt());
		System.out.print("영어 : "); s.setEng(sc.nextInt());
		System.out.print("수학 : "); s.setMath(sc.nextInt());
		
		arr.add(s);
		
	}
	public void deleteScore() {
		System.out.print("성적 삭제할 이름 : ");
		String name = sc.next();
		
		for (Score s : arr) {
			if (s.getName().equals(name)) {
				System.out.println(s.getName() + " 의 성적을 지움");
				arr.remove(s);
				break;
			}
		}
	}
	public void showScore() {
		for (Score s : arr) {
			System.out.println("-----------------------------");
			System.out.println("이름 : " + s.getName() +
					"\t국어 : " + s.getKor() + 
					"\t영어 : " + s.getEng() + 
					"\t수학 : " + s.getMath() + 
					"\n총점 : " + s.getSum() + 
					"\t평균 : " + s.getAvg() + 
					"\t학점 : " + s.getGrade()
					);
			
		}
	}

}
