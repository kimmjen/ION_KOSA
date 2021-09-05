package homework.day09.Video_map;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class VideoManager {

    private Scanner sc = new Scanner(System.in);
    HashMap<String, ArrayList<Video>> videomap = new HashMap<String, ArrayList<Video>>();

    // 1. 비디오 추가
    public void insertVideo() {
        String title, category;

        System.out.println("\n추가할 비디오의 정보를 입력 : ");
        System.out.print("비디오 제목 : ");
        title = sc.next();
        System.out.print("비디오 장르 : ");
        category = sc.next();

        if (!videomap.containsKey(title)) {
            videomap.put(title, new ArrayList<Video>());
        }

        ArrayList<Video> video = videomap.get(title);

        if (video.add(new Video(title, category))) {
            System.out.println("비디오 추가 성공");
        } else {
            System.out.println("비디오 추가 실패");
        }
    }

    // 2. 비디오 삭제
    public void deleteVideo() {
        String title;
        int count = 0;
        boolean flag = true;

        System.out.println("\n삭제할 비디오의 제목 입력 :");
        System.out.print("비디오 제목 : ");
        title = sc.next();

        if (!videomap.containsKey(title)) {
            System.out.println("해당 비디오가 없습니다.");
        } else {
            ArrayList<Video> video = videomap.get(title);

            for (int i = 0; i < video.size(); i++) {

                if (video.get(i).isRent()) {

                    count++;
                } else {
                    System.out.println(video.get(i).getRentName() + "님이 대여하신 비디오가 있습니다.");
                    flag = false;
                }
            }

            if (flag) {
                video.clear();
                videomap.remove(title);
                System.out.println("총 " + count + " 건의 비디오를 삭제했습니다.");
            }
        }
    }

    // 3.
    public void printVideo() {

        System.out.println("\n비디오 리스트를 출력합니다.");

        Iterator<String> keys = videomap.keySet().iterator();

        while (keys.hasNext()) {

            String title = keys.next();
            ArrayList<Video> list = videomap.get(title);

            System.out.println("[" + title + "] 비디오 목록");

            for (int i = 0; i < list.size(); i++) {

                System.out.println((i + 1) + " 번째 비디오");
                System.out.println(list.get(i).toString() + "\n");
            }
            System.out.println();
        }
    }

    // 4.
    public void modifyVideo() {
        String title, category;

        System.out.println("\n수정할 비디오의 제목을 입력해주세요.");
        System.out.print("비디오 제목 : ");
        title = sc.next();

        if (!videomap.containsKey(title)) {
            System.out.println("해당 비디오가 없습니다.");
        } else {
            ArrayList<Video> video = videomap.get(title);

            System.out.println("비디오의 정보를 입력하세요.");
            System.out.print("비디오 제목 : ");
            title = sc.next();
            System.out.print("비디오 장르 : ");
            category = sc.next();

            for (int i = 0; i < video.size(); i++) {
                video.get(i).setTitle(title);
                video.get(i).setCategory(category);
            }
            System.out.println("수정 완료");
        }
    }

    // 5.
    public void rentVideo() {

        String title, name;
        boolean flag = true;

        System.out.println("\n대여할 비디오의 제목을 입력해주세요.");
        System.out.print("비디오 제목 : ");
        title = sc.next();

        if (!videomap.containsKey(title)) {
            flag = false;
        } else {
            ArrayList<Video> video = videomap.get(title);

            for (int i = 0; i < video.size(); i++) {

                if (video.get(i).isRent()) {

                    System.out.println("대여하는 사람의 이름을 입력하세요.");
                    System.out.print("입력 : ");
                    name = sc.next();

                    video.get(i).setRent(false);
                    video.get(i).setRentName(name);
                    video.get(i).setRentDate(new Date());

                    flag = false;
                    System.out.println("대여가 완료되었습니다.");
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("해당 비오가 없거나, 모두 대여 중입니다.");
        }
    }

    // 6.
    public void returnVideo() {
        String title, name;
        boolean flag = true;

        System.out.println("\n반납할 비디오의 제목과 대여자명을 입력해주세요.");
        System.out.print("비디오 제목 : ");
        title = sc.next();
        System.out.print("비디오 대여자 : ");
        name = sc.next();

        if (!videomap.containsKey(title)) {
            flag = false;
        } else {
            ArrayList<Video> video = videomap.get(title);

            for (int i = 0; i < video.size(); i++) {

                if (video.get(i).getRentName().equals(name)) {
                    video.get(i).setRent(true);
                    video.get(i).setRentName(null);
                    video.get(i).setRentDate(null);

                    flag = false;
                    System.out.println("반납이 완료되었습니다.");
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("재생할 비디오가 없거나, 대여한 내역이 없습니다.");
        }
    }

}
