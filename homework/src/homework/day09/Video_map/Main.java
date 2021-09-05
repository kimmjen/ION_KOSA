package homework.day09.Video_map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VideoManager vm = new VideoManager();
        System.out.println("비디오 대여 정보 프로그램");
        System.out
                .println(" 1. 비디오 추가\n 2. 비디오 삭제\n 3. 비디오 리스트 출력\n 4. 비디오 정보 수정\n 5. 비디오 대여\n 6. 비디오 반납\n 7. 프로그램 종료");

        try {
            int num;
            while (true) {
                do {
                    System.out.print("원하는 작업의 번호 입력 (1 ~ 7) : ");
                    num = sc.nextInt();
                } while (num < 1 || num > 7);

                switch (num) {
                    case 1:
                        vm.insertVideo();
                        break;
                    case 2:
                        vm.deleteVideo();
                        break;
                    case 3:
                        vm.printVideo();
                        break;
                    case 4:
                        vm.modifyVideo();
                        break;
                    case 5:
                        vm.rentVideo();
                        break;
                    case 6:
                        vm.rentVideo();
                        break;
                    default:
                        System.out.println("시스템 종료");
                        System.exit(0);
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
