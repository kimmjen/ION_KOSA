package p_2021_09_02.video_map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class VideoManager {
	private static int cid = 0;
	HashMap<Integer, Video> map = new HashMap<Integer, Video>();
	Scanner sc = new Scanner(System.in);
	
	public void addVideo() {
		Video v = new Video();
		System.out.print("영화 제목 : "); v.setTitle(sc.next());
		System.out.print("영화 장르 : "); v.setCategory(sc.next());
		System.out.print("영화 대여자 : "); v.setMember(sc.next());
		
		map.put(cid++, v);
	}
	
	public void listVideo() {
		
		for (Entry<Integer, Video> entry : map.entrySet()) {
			System.out.println("--------------------------");
			System.out.println("대여 번호 : " + entry.getKey() +
					"\n" + entry.getValue().output());
			System.out.println("--------------------------");
		}
	}
	
	public void removeVideo() {
		System.out.print("삭제 할 번호 : ");
		
		int n = sc.nextInt();
		
		for (Integer i : map.keySet()) {
			if (i == n) {
				map.remove(i);
				break;
			}
		}
	}
	
	public void modifyVideo() {
		System.out.print("수정 할 번호 : ");
		int n = sc.nextInt();
		
		for (Entry<Integer, Video> entry : map.entrySet()) {
			if (entry.getKey() == n) {
				System.out.print("영화 제목 : "); entry.getValue().setTitle(sc.next());
				System.out.print("영화 장르 : "); entry.getValue().setCategory(sc.next());
				System.out.print("영화 대여자 : "); entry.getValue().setMember(sc.next());
				entry.getValue().modifyDate();
			}
		}
	}
}
