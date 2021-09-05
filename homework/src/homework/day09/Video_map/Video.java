package homework.day09.Video_map;

import java.util.Date;

public class Video {

    private String title, category, rentName;
    private boolean rent;
    private Date rentDate;

    public Video(String title, String category) {
        this.title = title;
        this.category = category;
        rent = true;
        rentName = null;
        rentDate = null;
    }

    // getter, setter
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

    public String getRentName() {
        return rentName;
    }

    public void setRentName(String rentName) {
        this.rentName = rentName;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    //
    @Override
    public String toString() {
        String print = "비디오 제목 : " + title + "\n비디오 장르 : " + category + "\n";

        if (rent) {
            print += "대여 가능한 비디오입니다.";
        } else {
            print += "대여 불가능한 비디오입니다.\n대여자 : " + rentName + "\n대여일자 : " + rentDate;
        }
        return print;
    }

}
