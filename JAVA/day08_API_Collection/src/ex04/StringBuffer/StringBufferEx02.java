package ex04.StringBuffer;

public class StringBufferEx02 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is Pencil"); // 문자열 추가
		System.out.println(sb);
		
		sb.insert(7, " my"); // 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, " your"); // 변경(교체)
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.setLength(20);
		System.out.println(sb);
	}
}
