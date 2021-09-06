package p_2021_09_02.video_array;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoManager {
	
	Scanner sc = new Scanner(System.in);
	private ArrayList<Video> arr = new ArrayList<Video>();
	
	public void addVideo() {
		Video v = new Video();
		System.out.print("영화 제목 : "); v.setTitle(sc.next());
		System.out.print("영화 장르 : "); v.setCategory(sc.next());
		System.out.print("영화 대여자 : "); v.setMember(sc.next());
		
		arr.add(v);
	}
	
	public void removeVideo() {
		System.out.print("삭제할 번호 : " );
		int n = sc.nextInt();
		
		for (Video v : arr) {
			if (v.getId() == n) {
				arr.remove(v);
				System.out.println("삭제 내용 : " + v.getTitle() + " 삭제되었습니다.");
				break;
			}
		}
	}
	
	public void showVideo() {
		for (Video v : arr) {
			System.out.println("----------------------");
			System.out.println("대여 번호 : " + v.getId() +
					"\t영화 제목 : " + v.getTitle() +
					"\t영화 장르 : " + v.getCategory() +
					"\t영화 대여 여부 : " + v.getLend() +
					"\t영화 대여자 : " + v.getMember() +
					"\t영화 대여 일자 : " + v.getDate()
					);
			System.out.println("----------------------");
			
		}
	}
	
	public void modifyVideo() {
		System.out.print("수정 할 번호 : ");
		int n = sc.nextInt();
		
		for (Video v : arr) {
			if (v.getId() == n) {
				System.out.print("영화 제목 : "); v.setTitle(sc.next());
				System.out.print("영화 장르 : "); v.setCategory(sc.next());
				System.out.print("영화 대여자 : "); v.setMember(sc.next());
				
				v.modifyDate();
			}
		}
	}

}
