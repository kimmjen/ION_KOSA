package ex04.StringBuffer;

public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		// 메모리 위치
		System.out.println("메모리 위치 : " + sb.hashCode());
		System.out.println("lenth    /    capacity");

		int len = sb.length();
		int size = sb.capacity();

		System.out.println(len + "    /    " + size);

		sb.append("kosa");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "    /    " + size);

		sb.append("hellojava");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "    /    " + size);

		sb.append("korea");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "    /    " + size);

		// 메모리 위치
		System.out.println("메모리 위치 : " + sb.hashCode());

		sb.append("abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwx");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "    /    " + size);

		// 메모리 위치
		System.out.println("메모리 위치 : " + sb.hashCode());

		sb.trimToSize(); // 용량의 크기를 조절해준다.
		System.out.println(len + "    /    " + size);

	}
}
