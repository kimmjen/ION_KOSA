package homework;

import java.util.Scanner;

/*
 * 과제1. int[] a = {7,5,3,8,2}; 배열의 합 구하는 프로그램 작성
 * 과제2. 9월의 강수량 평균을 구하는 프로그램 작성(단, 30일 기준)
 * {0, 33.3, 29.8, 0 , 0, 6.4,61.0, 0, 1.3, 3.9, 1.2, 5.7, 0, 0.0, 0, 0.3, 0, 0, 0.3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 38.3}
 * 과제3. 7의 갯수를 구해라.
    문자를 찾는다던가
    int[] a = {7,5,7,8,2,7,3,7,7,90}
    int seek=7;
    원하는 숫자의 갯수 찾는걸 만든다던가
   과제4. 7명의 데이터를 받아서 총점/평균/학점 구하는 프로그램 작성 (배열이용할 것)
   과제5. info() { 이름 연락처 주소 출력 함수}
   과제6. abs(int x) { 절댓값 출력하는 함수 만들기}
   과제7. max() { 두개 정수 입력 받아서 큰수 리턴하는 함수}
   과제8.성적처리 프로그램 함수로 분할 할것
	  입력함수 input()
	  총점함수 total(~~)
	  평균함수 average(~~)
	  평점(학점) grade(~~)
	  출력함수 output()
  과제9. loopLine(매개변수 넣을지 말지 개발자 역량) {라인을 N번 출력하는 함수}
 * */
public class Ass_1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// 과제1
		int[] a1 = {7, 5, 3, 8, 2};
		int sum = 0;
		for (int i : a1) {
			sum += i;
		}
		System.out.println("과제1 \n : " + sum);
		
		// 과제2
		System.out.println("\n과제2");
		
		double[] rain = {0, 33.3, 29.8, 0 , 0, 6.4,61.0, 0, 1.3, 3.9, 1.2, 5.7, 0, 0.0, 0, 0.3, 0, 0, 0.3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 38.3};
		int day = sc.nextInt();
		double avg = 0.;
		for (int i = 0; i < day; i++) {
			System.out.printf("%d일의 강수량을 입력하시오. : ", i + 1);
			rain[i] = sc.nextDouble();
			avg += rain[i];
		}
		System.out.printf("강수량 평균 : %.2f", avg / day);
		
		// 과제3
		System.out.println("\n\n과제3");
		int[] a2 = {7,5,7,8,2,7,3,7,7,90};
		int seek = 7;
		int cnt = 0;
		for (int i : a2) {
			if (i == seek) cnt++;
		}
		System.out.println("답 : " + cnt);
		
	}
}
