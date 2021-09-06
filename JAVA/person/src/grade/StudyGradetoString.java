//package grade;
//
//import java.util.Scanner;
//
//class Name {
//	// 학생 이름 정보
//	Name() {
//	}
//
//	private String name;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//}
//
//class Score {
//	// 국영수 점수
//	Score() {
//	}
//
//	private int kor, eng, math;
//
//	public int getKor() {
//		return kor;
//	}
//
//	public void setKor(int kor) {
//		this.kor = kor;
//	}
//
//	public int getEng() {
//		return eng;
//	}
//
//	public void setEng(int eng) {
//		this.eng = eng;
//	}
//
//	public int getMath() {
//		return math;
//	}
//
//	public void setMath(int math) {
//		this.math = math;
//	}
//}
//
//class Student {
//	// has - a, Name,Score 클래스를 가지고 있어야 함
//	Name name;
//	Score score;
//	int total;
//	double avg;
//
//	Student() {
//		name = new Name();
//		score = new Score();
//	}
//
//	// 합계, 평균
//	int getSum() {
//		total = score.getKor() + score.getEng() + score.getMath();
//		return total;
//	}
//
//	double getAvg() {
//		avg = total / 3.0;
//		return avg;
//	}
//
//	@Override // toString 오버라이드 해줘서 전체 출력
//	public String toString() {
//		return "이름: " + name.getName() + "국어: " + score.getKor() + "영어: " + score.getEng() + "수학: " + score.getMath()
//				+ "총점: " + this.getSum() + "평균: " + this.getAvg() + "\n";
//	}
//}
//
//public class StudyGradetoString {
//	public static void main(String[] args) {
//		// 1.입력 2.출력 3.검색 4.수정 5.삭제
//		int i = 0; // 배열의 칸
//		int j;
//		int move;
//		String search;
//		Student[] student = new Student[50];// Student 배열 선언
//		Scanner scanner = new Scanner(System.in);
//
//		while (true) {
//			System.out.println("1.입력  2.출력  3.검색  4.수정  5.삭제  6.종료");
//			int num = scanner.nextInt();
//			switch (num) {
//			case 1:
//				student[i] = new Student(); // 객체 생성
//				System.out.println("이름 입력 : ");
//				student[i].name.setName(scanner.next()); // 입력
//				System.out.println("국어점수 입력 : ");
//				student[i].score.setKor(scanner.nextInt());
//				System.out.println("영어점수 입력 : ");
//				student[i].score.setEng(scanner.nextInt());
//				System.out.println("수학점수 입력 : ");
//				student[i].score.setMath(scanner.nextInt());
//				i++;// 다음 배열 칸으로 넘어가기 위해
//				break;
//			case 2:
//				Student temp = new Student();
//				for (j = 0; j < i; j++) {
//					if (student[j] == null)
//						break;
//				}
//				for (int k = 0; k < j - 1; k++) {
//					for (int k2 = 0; k2 < j - 1; k2++) {
//						if (student[k2].getSum() < student[k2 + 1].getSum()) { // 버블, 큰수 작은수 비교해서 스왑
//							temp = student[k2];
//							student[k2] = student[k + 1];
//							student[k + 1] = temp;
//						}
//					}
//				}
//				for (int t = 0; t < j; t++) {
//					System.out.println(student[t].toString()); // toString으로 전체 출력
//				}
//				break;
//			case 3:
//				System.out.println("1.이름검색 2.점수검색");
//				int n1 = scanner.nextInt();
//				switch (n1) {
//				case 1:
//					System.out.println("이름 : ");
//					search = scanner.next();
//					for (j = 0; j < i; j++) {
//						if (student[j].name.getName().equals(search)) {
//							break; //
//						}
//					}
//					System.out.println(student[j].toString());
//					break;
//				case 2:
//					System.out.println("1.국어 2.영어 3.수학");
//					int n2 = scanner.nextInt();
//					switch (n2) {
//					case 1:
//						System.out.println("국어점수 : ");
//						int n3 = scanner.nextInt();
//						for (int k = 0; k < i; k++) {
//							if (student[k].score.getKor() >= n3) {
//								System.out.println(student[k].name.getName() + " 국어점수 : " + student[k].score.getKor());
//							}
//						}
//						break;
//					case 2:
//						System.out.println("영어점수 : ");
//						int n4 = scanner.nextInt();
//						for (int k = 0; k < i; k++) {
//							if (student[k].score.getEng() >= n4) {
//								System.out.println(student[k].name.getName() + " 영어점수 : " + student[k].score.getEng());
//							}
//						}
//						break;
//					case 3:
//						System.out.println("수학점수 : ");
//						int n5 = scanner.nextInt();
//						for (int k = 0; k < i; k++) {
//							if (student[k].score.getMath() >= n5) {
//								System.out.println(student[k].name.getName() + " 수학점수 : " + student[k].score.getMath());
//							}
//						}
//						break;
//					}
//					break;
//				}
//				break;
//			case 4:
//				System.out.println("수정 할 사람 : ");
//				search = scanner.next();
//				for (j = 0; j < student.length; j++) {
//					if (student[j].name.getName().equals(search)) {
//						break;
//					}
//				}
//				System.out.println("수정 할 과목 : 1.국어 2.영어 3.수학 : ");
//				int subjectSujung = scanner.nextInt();
//				if (subjectSujung == 1) {
//					System.out.println("국어 점수 수정 : ");
//					student[j].score.setKor(scanner.nextInt());
//				} else if (subjectSujung == 2) {
//					System.out.println("영어 점수 수정 : ");
//					student[j].score.setEng(scanner.nextInt());
//				} else if (subjectSujung == 3) {
//					System.out.println("수학 점수 수정");
//					student[j].score.setMath(scanner.nextInt());
//				} else {
//					System.out.println("잘못된 입력");
//				}
//				break;
//			case 5:
//				System.out.println("삭제 할 대상 : ");
//				search = scanner.next();
//				for (j = 0; j < student.length; j++) {
//					if (student[j].name.getName().equals(search)) {
//						break;
//					}
//				}
//				student[j] = null; // 널 값
//				for (move = j; move < student.length - 1 - j; move++) {
//					student[move] = student[move + 1];
//				}
//				break;
//			case 6:
//				System.out.println("종료");
//				return;
//			}
//		}
//	}
//}