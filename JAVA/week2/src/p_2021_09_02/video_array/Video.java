package p_2021_09_02.video_array;

import java.time.LocalDate;

public class Video {
	private static int cid;
	private int id;
	private String title, category, member;
	private boolean lend = false;
	private LocalDate date;
	
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
	
	public Video() {
//		super();
		this.id = cid++;
		this.date = LocalDate.now();
		this.lend = lend;
	}
	
	public int getId() {
		return id;
	}
	
	public String getLend() {
		if(lend) {
			return "대여중";
		}else {
			return "대여X";
		}
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void modifyDate() {
		this.date = LocalDate.now();
	}
	

	
	
}
