package p_2021_09_02.video_map;

import java.time.LocalDate;

public class Video {
	
	private String title, category, member;
	private boolean lend = false;
	private LocalDate date;
	
	public Video() {
		this.date = LocalDate.now();
		this.lend = true;
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
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	
	public String getLend() {
		if (lend) {
			return "대여중";
		} else {
			return "대여X";
		}
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void modifyDate() {
		this.date = LocalDate.now();
	}
	
	public String output() {
		return "제목 : " + title 
				+ "\n장르 : " + category
				+ "\n대여여부 : " + getLend()
				+ "\n대여자 : " + member
				+ "\n대여일자 : " + getDate();
	}
	
	

}
