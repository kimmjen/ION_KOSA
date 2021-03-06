package grade;

import java.util.Scanner;

class Name {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Score {
	int score;
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
}

class Manager {
	Name name = new Name();
	Score kor = new Score();
	Score math = new Score();
	Score eng = new Score();
	
	public void setName(String name) {
		this.name.setName(name);
	}
	
	public String getName() {
		return this.name.getName();
	}
	
	public void setKor(int score) {
		this.kor.setScore(score);
	}
	
	public int getKor() {
		return this.kor.getScore();
	}
	
	public void setMath(int score) {
		this.math.setScore(score);
	}
	
	public int getMath() {
		return this.math.getScore();
	}
	
	public void setEng(int score) {
		this.eng.setScore(score);
	}
	
	public int getEng() {
		return this.eng.getScore();
	}
	
	public void setSum(int sum) {
	}
}
public class StudyGradeArray {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 이름 국어 영어 수학 총점 평균
		// 입력 = 학생수 50
		// 한사람씩 입력
		// 출력 = 전체 출력
		// 검색 & 성적(ex 80점 이상만 출력 성적순정렬)
		// 삭제
		String name1;

		int score;
		int num = 0;

		Name nameclass = new Name();

		Score scoreclass = new Score();

		Manager[] s = new Manager[50];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Manager();
		}

		while (true) {

			System.out.println("입력, 출력, 검색, 수정, 삭제, 종료");

			String order = sc.next();

			if (order.equals("입력")) {

				System.out.println("이름 : ");

				s[num].name.setName(sc.next());

				System.out.println("국어 : ");

				s[num].kor.setScore(sc.nextInt());

				System.out.println("수학 : ");

				s[num].math.setScore(sc.nextInt());

				System.out.println("영어 : ");

				s[num].eng.setScore(sc.nextInt());
				;

				num++;

			} else if (order.equals("출력")) {

				for (int i = 0; i < num; i++) {

					System.out.println("이름 : " + s[i].getName());

					System.out.println("국어 : " + s[i].getKor());

					System.out.println("수학 : " + s[i].getMath());

					System.out.println("영어 : " + s[i].getEng());

					System.out.print("총점 : ");

					System.out.println(s[i].getKor() + s[i].getEng() + s[i].getMath());

					System.out.print("평균 : ");

					System.out.println((s[i].getKor() + s[i].getEng() + s[i].getMath()) / 3);

				}

			} else if (order.equals("수정")) {

				for (int i = 0; i < num; i++) {

					System.out.println("이름");

					String search = new Scanner(System.in).next();

					if (search.equals(s[i].getName())) {

						System.out.println("국어, 영어, 수학");

						String subject = new Scanner(System.in).next();

						if (subject.equals("국어")) {

							s[i].setKor(sc.nextInt());

						} else if (subject.equals("영어")) {

							s[i].setEng(sc.nextInt());

						} else if (subject.equals("수학")) {

							s[i].setMath(sc.nextInt());

						}

					}

				}

			} else if (order.equals("검색")) {

				for (int i = 0; i < num; i++) {

					System.out.println("이름");

					String search = new Scanner(System.in).next();

					if (search.equals(s[i].getName())) {

						System.out.println("이름 : " + s[i].getName());

						System.out.println("국어 : " + s[i].getKor());

						System.out.println("수학 : " + s[i].getMath());

						System.out.println("영어 : " + s[i].getEng());

						System.out.print("총점 : ");

						System.out.println(s[i].getKor() + s[i].getEng() + s[i].getMath());

						System.out.print("평균 : ");

						System.out.println((s[i].getKor() + s[i].getEng() + s[i].getMath()) / 3);

					}

				}

			} else if (order.equals("삭제")) {

				for (int i = 0; i < num; i++) {

					System.out.println("이름");

					String search = new Scanner(System.in).next();

					if (search.equals(s[i].getName())) {

						for (int j = i; j < s.length - 1; j++) {

							s[j] = s[j + 1];

							s[s.length - 1] = null;

						}

					}

				}
				num--;

			}
			if (order.equals("종료")) {

				break;

			}

		}

	}

}