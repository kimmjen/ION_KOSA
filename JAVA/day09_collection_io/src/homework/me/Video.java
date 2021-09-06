package homework.me;

import java.util.Date;

public class Video {

	// member
	private String title;
	private String category;
	private boolean lend;
	private String lendName;
	private Date lendDate;
	
	// constuctor
	public Video(String title, String category) {
		
		this.title = title;
		this.category = category;
		lend = true;
		lendName = null;
		lendDate = null;
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public boolean isLend() {
		return lend;
	}


	public void setLend(boolean lend) {
		this.lend = lend;
	}


	public String getLendName() {
		return lendName;
	}


	public void setLendName(String lendName) {
		this.lendName = lendName;
	}


	public Date getLendDate() {
		return lendDate;
	}


	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}


	@Override
	public String toString() {
//		return "영화제목" + title + 
//				", 카테고리 = " + category + 
//				", 대여여부 = " + lend + 
//				", 대여자(소객명) = " + lendName+ 
//				", 대여 날짜 = " + lendDate;
		String print = "비디오 제목 : " + title + "\n비디오 장르 : " + category;
		
		if (lend) {
			print += "대여가능한 비디오입니다.";
		}
		else {
			print += "대여 불가능한 비디오입니다. \n대여자 : " + lendName + "\n대여일자 : " + lendDate;
		}
		return print;
	}
	
}
