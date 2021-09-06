package homework.day05.P_10;

import java.util.Scanner;

public class Student {
    private String name;
    private int kor, eng, math, total;
    private double avg;
    private char grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    //
    public boolean setKor(int kor) {
        this.kor = kor;
        return scoreError(kor);
    }

    public int getEng() {
        return eng;
    }

    //
    public boolean setEng(int eng) {
        this.eng = eng;
        return scoreError(eng);
    }

    public int getMath() {
        return math;
    }

    //
    public boolean setMath(int math) {
        this.math = math;
        return scoreError(math);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    //
    public void input(Scanner sc) {
        System.out.println("정보 입력");
        System.out.print("이름 : ");
        this.name = sc.next();

        while (true) {
            try {
                System.out.print("국어 : ");
                if (setKor(sc.nextInt())) {
                    continue;
                }
                System.out.print("영어 : ");
                if (setEng(sc.nextInt())) {
                    continue;
                }
                System.out.print("수학 : ");
                if (setMath(sc.nextInt())) {
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("숫자만 입력해주세요.");
                e.printStackTrace();
            }
        }
    }

    //
    public boolean scoreError(int score) {

        if (score < 0 || score > 100) {
            System.out.println("잘못 입력");
            System.out.println(score + " 학생의 점수를 다시 입력해주세요.\n");
            return true;
        }
        return false;
    }

    //
    public void total() {
        this.total = this.kor + this.eng + this.math;
    }

    //
    public void average() {
        this.avg = (double) this.total / 3;
    }

    //
    public void grade() {

        switch ((int) this.avg / 10) {
            case 10:
            case 9:
                this.grade = 'A';
                break;
            case 8:
                this.grade = 'B';
                break;
            case 7:
                this.grade = 'C';
            case 6:
                this.grade = 'D';
                break;
            default:
                this.grade = 'F';
                break;
        }
    }

    //
    public void output() {

        System.out.println(this.name + "의 성적표");
        System.out.println("국어 : " + this.kor + "영어 : " + this.eng + "수학 : " + this.math);
        System.out.println(
                "총점 : " + this.total + ", 평균 : " + String.format("%.2f", this.avg) + ", 평점(학점) : " + this.grade + "\n");
    }

}
