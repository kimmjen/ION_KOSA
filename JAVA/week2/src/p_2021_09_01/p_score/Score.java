package p_2021_09_01.p_score;

import java.util.Scanner;

public class Score {

	String name;
	int kor, eng, com, sum;
	double avg;
	char grade;
	
	public int total() {
		return kor + eng + com;
	}
	
	public void input() {
		System.out.print("이름 입력 : ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		try {
			do {
				System.out.print("국어 성적 : ");
				kor = sc.nextInt();
			} while (kor < 0 && kor > 100);
			
			do {
				System.out.print("영어 성적 : ");
				eng = sc.nextInt();
			} while (eng < 0 && eng > 100);
			
			do {
				System.out.print("전산 성적 : ");
				com = sc.nextInt();
			} while (com < 0 && com > 100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sum = total();
		avg = calAvg();
		grade = calGrade((int) avg / 10);
	}
	
	public double calAvg() {
		return (double)sum / 3.0;
	}
	public char calGrade(int i) {
		switch (i) {
		case 10:
		case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		default: return 'F';
		}
	}

	@Override
	public String toString() {
		return 
				"**********" + name + 
				" 님의 성적표 \n" +
				"국어 : " + kor + " 점" +
				", 영어 : " + eng + " 점" + 
				", 전산 : " + com + " 점\n" +
				"총합 점수 : " + sum + " 점" +
				", 평균 점수 : " + avg + " 점" +
				", 학점" + grade;
	}
	
}
