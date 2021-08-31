package P_2021_08_30;

import java.util.Scanner;

/*
 * 성적프로그램
 */
class Score {
	String name;
	int kor, eng, com, total;
	double avg;
	char grade;
	
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
	public int total() {
		return kor + eng + com;
	}
	int sum = 0;
	public void input() {
		System.out.println("이름 입력 : ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		try {
			do {
				System.out.println("국어 성적 입력 : ");
				kor = sc.nextInt();
			} while (0 > kor && kor > 100);
			do {
				System.out.println("영여 성적 입력 : ");
				eng = sc.nextInt();
			} while (0 > eng && eng > 100);
			do {
				System.out.println("전산 성적 입력 : ");
				com = sc.nextInt();
			} while (0 > com && com > 100);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		sum = total();
		avg = Avg_sum();
//		grade = Grade_sum((int) avg / 10);
	}
	
	public double Avg_sum() {
		return (double) sum / 3.0;
	}

	
	
}

public class Q_5 {
	public static void main(String[] args) {
		
	}
}
