package ex03.Switch;
import java.util.Scanner;
/* 문제 윤녕/평년 판정 프로그램 작성
 * */
public class MainEntry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1, 2, 3 중 하나를 선택하세요. : ");
		
		int point = sc.nextInt(); // 문자열 중에서 첫 글자 한글자만 추출함
		
		switch (point) {
			case 1:  System.out.print("집"); break;
			case 2:  System.out.print("피아노"); break;
			case 3:  System.out.print("우산"); break;
			
		default:
			System.out.println("범위밖 숫자 입니다. 다시 선택하세요.");
			System.exit(0);
		}
		System.out.println("상품 획득");
	}
}


/*
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1, 2, 3 중 하나를 선택하세요. : ");
		
		int point = sc.nextInt(); // 문자열 중에서 첫 글자 한글자만 추출함
		
		switch (point) {
			case 1:  System.out.print("집"); break;
			case 2:  System.out.print("피아노"); break;
			case 3:  System.out.print("우산"); break;
			
		default:
			System.out.println("범위밖 숫자 입니다. 다시 선택하ㅔ요.");
			System.exit(0);
		}
		System.out.println("상품 획득");
	}
}

//*/