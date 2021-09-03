package p_2021_09_02.video_array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VideoManager vm = new VideoManager();

		System.out.println("비디오 관리 프로그램");
		System.out.println("1. 영화 추가\n2. 영화 삭제\n3. 영화 리스트 출력\n4. 영화 수정\n5. 종료");

		try {
			int num;
			while (true) {
				do {
					System.out.print("원하시는 작업의 번호 입력(1~5) : ");
					num = sc.nextInt();
				} while (num < 1 || num > 5);

				switch (num) {
				case 1:
					vm.addVideo();
					break;
				case 2:
					vm.removeVideo();
					break;
				case 3:
					vm.showVideo();
					break;
				case 4:
					vm.modifyVideo();
					break;
				default:
					System.out.print("프로그램 종료");
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}