package homework.me;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VideoManager {

	Scanner sc;
	Map<String, Video> videoMap;
	
	public VideoManager() {
		sc = new Scanner(System.in);
		videoMap = new HashMap<String, Video>();
	}
	
	public void start() {
		System.out.println("비디오 대여 정보 프로그램");
		
		while(true) {
			System.out.println("메뉴선택");
			System.out.println("1. 비디오 추가");
			System.out.println("2. 비디오 삭제");
			System.out.println("3. 비디오 리스트 출력");
			System.out.println("4. 비디오 정보 수정");
			System.out.println("5. 비디오 대여");
			System.out.println("6. 비디오 반납");
			System.out.println("7. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			
			int num = 0;
			do {
				System.out.println("원하는 번호 입력");
				num = sc.nextInt();
			} while(num < 1 || num > 7);
			
			switch(num) {
			case 1: {
			}
			}
			
		}
	}


}
