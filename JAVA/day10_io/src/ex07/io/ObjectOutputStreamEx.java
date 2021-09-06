package ex07.io;

import java.io.*;

public class ObjectOutputStreamEx {
	
	public static void main(String[] args) throws IOException {
		
		Grade vo = new Grade();
//		vo.setSubject("미술");
//		vo.setScore(80);
		vo.setScore(90);
		vo.setSubject("전산");
		
		System.out.println(vo);
		OutputStream os = new FileOutputStream("grade.txt"); //파일로저장
		ObjectOutputStream oos = new ObjectOutputStream(os); // 객체로 사용
		
		oos.writeObject(vo); //
		oos.close();
	}
}



