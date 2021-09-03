package ex01.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Date date = new Date();
		Vector V = new Vector(3, 5);

//		받는 데이터가 object
		V.addElement("자바"); // string
		V.addElement(new Double(10.2)); // Double
		V.addElement(date); // ojbect
		System.out.println("-------- 3개 객체 추가 완료 --------");
		System.out.println("size : " + V.size() + ", capacity : " + V.capacity());
		System.out.println(V);

		for (i = 0; i < 10; i++) {
			V.addElement(new Integer(i));
		}
		System.out.println("-------- 10개 객체 추가 완료 --------");
		System.out.println("size : " + V.size() + ", capacity : " + V.capacity());
//		System.out.println(V);
		System.out.println();

		System.out.println("-------- Vector 내용 출력 --------");
		Enumeration enu = V.elements(); // The returned Enumeration object will generate all items in this vector. --
										// 열거형(Enumeration)

		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + ", "); // nextElemnet - ojbect 타입
		}

		System.out.println();

		System.out.println("-------- 객체 내용 포함 확인 --------");
		if (V.contains("자바"))
			System.out.println("해당 객체 유");
		else
			System.out.println("해당 객체 무");

		System.out.println("10.2 객체 위치는? " + V.indexOf(new Double(10.2)));
		System.out.println();
		System.out.println("Date : " + date);
		// 데이터 추가
		System.out.println(V.get(V.indexOf(date)));
		System.out.println("size : " + V.size() + ", capacity : " + V.capacity());
		// 데이터 삭제
		V.removeElementAt(V.lastIndexOf(date)); // Deletes the component at the specified index,  Returns the index of the last occurrence of the specified elementin this vector, or -1 if this vector does not contain the element
		System.out.println("size : " + V.size() + ", capacity : " + V.capacity());
		System.out.println(V);
//		System.out.println(V.remove(0));
		System.out.println();
		// i 데이터 삭제
		for (i = 0; i < V.size(); i++) {
//			V.removeElementAt(i);
			V.removeAllElements();
//			V.remove(10.2);
//			V.remove("자바");
		}
		System.out.println();
		System.out.println("size : " + V.size() + ", capacity : " + V.capacity());
//		System.out.println(V);
		System.out.println();
		
		for (i = 0; i < V.size(); i++) {
			System.out.println(V.get(i));
		}
		System.out.println(V);
		System.out.println();
		
		V.setElementAt("java", 2); // 3번째 위치에 java 문자열 추가
		enu = V.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		System.out.println("\n\n");
		V.trimToSize();
		System.out.println("size : " + V.size() + ", capacity : " + V.capacity());
		System.out.println();

	}

}
