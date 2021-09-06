package homework;

import java.util.Scanner;

class Q_2 {
	String name;
	int kor;
	int eng;
	int com;
	String grade;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
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
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void input_score() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요 : ");
		setName(sc.next());
		int score = 0;
		while (true) {
			System.out.print("국어 : ");
			score = sc.nextInt();
			if (score >= 0 && score <= 100)
				break;
		}
		setKor(score);
		while (true) {
			System.out.print("전산 : ");
			score = sc.nextInt();
			if (score >= 0 && score <= 100)
				break;
		}
		setCom(score);
		while (true) {
			System.out.print("영어 : ");
			score = sc.nextInt();
			if (score >= 0 && score <= 100)
				break;
		}
		setEng(score);
		chk_grade();
	}
	
	public void chk_grade() {
		switch ((this.kor+this.eng+this.com)/30) {
		case 10:
		case 9:
			setGrade("A");
			break;
		case 8:
			setGrade("B");
			break;
		case 7:
			setGrade("C");
			break;
		case 6:
			setGrade("D");
			break;
		default:
			setGrade("F");
			break;
		}
	}
	
	public void disp() {
		input_score();
		System.out.println("\n이름 : " + name + "님의 성적표 ******\n국어 : " + kor+ "점, 전산 : " + com+ "점, 영어 : " + eng + "점");
		System.out.printf("총점 :  %d점 평균 : %.2f점\n", (kor+eng+com), (kor+eng+com)/3.0);
		System.out.println("평점(학점) : " + grade);
	}

	public static void main(String[] args) {
		Q_2 work = new Q_2();
		work.disp();
	}
}
