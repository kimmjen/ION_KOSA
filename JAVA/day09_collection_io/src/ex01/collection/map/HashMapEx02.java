package ex01.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// 중복 허용 X, 순서 없음
public class HashMapEx02 {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>(); // 1.5이하버전은 이렇게
//		Map<String, Integer> map = new HashMap();
		
		map.put("kbs", 1234);
		map.put("mbc", new Integer(1111));
		map.put("sbs", 2222);
		map.put("홍길동", 3333);
		map.put("이몽룡", 1004);
		
		// 변수 만들기
		Set set = map.entrySet(); // key, value 값 다 불러옴(entrySet)
		System.out.println(set);
		
		// 분리
//		Iterator it = set.iterator();
		
		Iterator it = map.entrySet().iterator();
		
		while (it.hasNext()) {// 요소가 존재한다면
			Map.Entry e = (Map.Entry)it.next(); // next= object, 형변환
			System.out.println("name: " + e.getKey() + ", score : " + e.getValue());
		}
		
		Set set2 = map.keySet();
		System.out.println("참가자 명단 : " + set2);
		
		// 순서대로 원하다면 treeset 사용
		System.out.println();
		//
		Collection values =  map.values(); //
		it = values.iterator();
		
		int total = 0;
		while (it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("total :" + total);
		System.out.println("avg : " + total/set.size());
		System.out.println("avg : " + (float)total/set.size());
		System.out.println("MAX score : " + Collections.max(values));
		System.out.println("MIN score : " + Collections.min(values));
		
		
		
		
	}
}
