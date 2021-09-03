package ex07.file;

import java.io.*;

public class BinaryCopy {
	public static void main(String[] args) {
		
//		File src = new File("C:\\Windows\\explorer.exe");
		File src = new File("C:\\Users\\kimmjen\\OneDrive\\바탕 화면\\보관\\11.png");
		File dist = new File("C:\\ION_workspace\\ION_KOSA\\image\\11.png");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src); //파일입력바이트 스트림 연결
			fos = new FileOutputStream(dist); //파일 출력 바이트스트림 연결
			bis = new BufferedInputStream(fis); // 버퍼 입력스트림 연결
			bos = new BufferedOutputStream(fos); // 버퍼 출력스트림 연결
			
			while( (c = bis.read()) != -1 ) {
				bos.write((char)c );
			} // while end
			
			System.out.println("파일 복사 성공");
			bis.close();			bos.close();
			fis.close();			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 복사 오류 발생!!!");
			//e.printStackTrace();
		} //end try
		
	}

}
