//package homework.H;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Scanner;
//
//import homework.me.Video;
//
//public class MainEntry {
//	public static void main(String[] args) {
//		int no = 1;
//		Scanner sc = new Scanner(System.in);
//		Map<Integer, Video> map = new HashMap<>();
//		int typ = 0;
//		while (true) {
//			System.out.println("\n1 - 비디오추가, 2 - 비디오삭제, 3 - 비디오 리스트 출력, 4 - 비디오 정보 수정, 5 - 프로그램 종료");
//			while (true) {
//				System.out.print("숫자로 입력하세요 : ");
//				typ = sc.nextInt();
//				if (typ >= 1 && typ <= 5)
//					break;
//			}
//			if (typ == 5) {
//				System.out.println("종료");
//				break;
//			}
//			switch (typ) {
//			case 1:
//				video_add(map, no++);
//				break;
//			case 2:
//				video_delete(map);
//				break;
//			case 3:
//				System.out.println("비디오 정보를 출력합니다.");
//				Iterator it = map.entrySet().iterator();
//
//				while (it.hasNext()) {
//					Map.Entry e = (Map.Entry) it.next();
//					System.out.println(e.getValue().toString());
//				}
//				System.out.println("-----------성공-----------");
//				break;
//			default:
//				video_update(map);
//				break;
//			}
//		}
//	}
//
//	public static void video_update(Map<Integer, Video> map) {
//		String name = "";
//		String cate = "";
//		int lend = 0;
//		Scanner sc = new Scanner(System.in);
//		if (map.size() == 0)
//			System.out.println("비디오 정보가 비어있습니다.");
//		else {
//			System.out.println("수정할 비디오의 번호를 입력하세요.");
//			int num = sc.nextInt();
//			if (map.containsKey(num)) {
//				System.out.print("비디오 이름 : ");
//				map.get(num).setTitle(sc.next());
//				System.out.print("비디오 장르 : ");
//				map.get(num).setCategory(sc.next());
//				System.out.println("비디오 정보를 입력하세요.");
//				while (true) {
//					System.out.print("비디오 대여여부 : 1 - 대여함, 2 - 대여하지않음 ");
//					lend = sc.nextInt();
//					if (lend == 1 || lend == 2)
//						break;
//				}
//				if (lend == 2) {
//					map.get(num).setLend(true);
//					map.get(num).setLendName("");
//					map.get(num).setLendDate(null);
//				} else {
//					System.out.print("비디오 빌리는 사람 이름 : ");
//					String lend_name = sc.next();
//					map.get(num).setLend(false);
//					map.get(num).setLendName(lend_name);
//					map.get(num).setLendDate(new Date());
//				}
//				System.out.println("------------성공------------");
//			} else {
//				System.out.println("입력한 번호의 비디오는 존재하지 않습니다.");
//			}
//		}
//	}
//
//	public static void video_delete(Map<Integer, Video> map) {
//		Scanner sc = new Scanner(System.in);
//		if (map.size() == 0)
//			System.out.println("비디오 정보가 비어있습니다.");
//		else {
//			System.out.println("삭제할 비디오의 번호를 입력하세요.");
//			int num = sc.nextInt();
//			if (map.containsKey(num)) {
//				map.remove(num);
//				System.out.println("------------성공------------");
//			} else {
//				System.out.println("입력한 번호의 비디오는 존재하지 않습니다.");
//			}
//		}
//	}
//
//	public static void video_add(Map<Integer, Video> map, int no) {
//		String name = "";
//		String cate = "";
//		int lend = 0;
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("비디오 정보를 입력하세요.");
//		System.out.print("비디오 이름 : ");
//		name = sc.next();
//		System.out.print("비디오 장르 : ");
//		cate = sc.next();
//		while (true) {
//			System.out.print("비디오 대여여부 : 1 - 대여함, 2 - 대여하지않음 ");
//			lend = sc.nextInt();
//			if (lend == 1 || lend == 2)
//				break;
//		}
//		if (lend == 2) {
//			Video v = new Video(name, cate, true, "", null);
//			map.put(no, v);
//		} else {
//			System.out.print("비디오 빌리는 사람 이름 : ");
//			String lend_name = sc.next();
//			Video v = new Video(name, cate, false, lend_name, new Date());
//			map.put(no, v);
//		}
//		System.out.println("------------성공------------");
//	}
//}