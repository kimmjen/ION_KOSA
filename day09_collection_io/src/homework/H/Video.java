package homework.H;

import java.util.Date;

public class Video {
	public static int num = 1;
	private int video_num;
	private String title;
	private String category;
	private boolean lend;
	private String lendName;
	private Date lendDate;

//	public Video(String title, String category) {
//		this.title = title;
//		this.category = category;
//	}

	public Video(String title, String category, boolean lend, String lendName, Date lendDate) {
		super();
		this.video_num = num++;
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}

	public int getVideo_num() {
		return video_num;
	}

	public void setVideo_num(int video_num) {
		this.video_num = video_num;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Video.num = num;
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
		String pos = "";
		if (lendName.equals(""))
			lendName = "(없음)";
		if (lend == true)
			pos = "O";
		else
			pos = "X";
		return "Video [video_num : " + video_num + ", title : " + title + ", category : " + category + ", 대여 가능" + pos
				+ ", 빌린 사람 이름 : " + lendName + ", 빌린 날짜 : " + lendDate + "]";
	}

}