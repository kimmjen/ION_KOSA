package ex03.string;

public class StringAddress {
	public static void main(String[] args) {
		String s1 = new String("korea");
		String s2 = new String("korea");
		
		System.out.println(s1 + ", " + s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = "korea";
		System.out.println(s3.hashCode());
		
		s3 = "kbs";
		System.out.println(s3.hashCode());
		s3 = "mbc";
		System.out.println(s3.hashCode());
		s3 = "sbs";
		System.out.println(s3.hashCode());
		
		String msg = "asdfgjkl";
		String lll = "sdfasdfa";
		System.out.println(" deagu " + msg);
		System.out.println(msg.concat(lll));
		
		String s4 = "asbsdf".substring(2);
		System.out.println(s4);
		
		String s5 = "aasdfasdfasdfsbsdf".substring(2,5); // 시작값 포함, 끝값 미포함
		
		
		System.out.println(s5);
		
		msg = msg.concat(" aaaaaaaa");
		System.out.println(msg);
		msg = msg + " bbbbbbb";
		System.out.println(msg);
	}
}
