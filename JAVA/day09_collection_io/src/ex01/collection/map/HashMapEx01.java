package ex01.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 중복 허용 X
public class HashMapEx01 {
	public static void main(String[] args) {

		Map map = new HashMap();
		// 중복 제거
		map.put("kosa", "123"); // key(중복X), value
		map.put("bit", "1004");
		map.put("sbs", "hi");
		map.put("mbc", "123");
		
		System.out.println(map);
		System.out.println();
		
		// 요소 갯수 확인
		System.out.println("요소 개수 : " + map.size()); //
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password 입력하세요.");
			System.out.print("id : ");
			String id = sc.nextLine().trim(); // trim 공백제거
			System.out.print("password : ");
			String pwd = sc.nextLine().trim();
			
			if (!map.containsKey(id)) {// 해당 아이디 X
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else { // 아이디가 존재한다면
				if (!map.get(id).equals(pwd)) { // 꺼내온 아이디가 pwd가 같지 않다면
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else {
					System.out.println( id + " 와 " + pwd + " 가 일치 합니다.");
					break;
				}
			}
		} // end while
		
	}
}
