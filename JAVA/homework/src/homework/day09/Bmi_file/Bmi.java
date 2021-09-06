package homework.day09.Bmi_file;

import java.util.Scanner;

public class Bmi {
    static int cnt = 1;
    private int idx, height, weight;
    private double bmi;
    private String name;

    Scanner sc = new Scanner(System.in);

    public Bmi() {

        idx = cnt;

        try {
            System.out.print("이름을 입력해주세요 : ");
            name = sc.next();
            System.out.print("키를 입력해주세요 : ");
            height = sc.nextInt();
            System.out.print("몸무게를 입력해주세요 : ");
            weight = sc.nextInt();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    @Override
    public String toString() {
        return idx + "번\n" + "name = " + name + "\nheight = " + height + "\nweight = " + weight + "\nbmi = " + bmi;
    }

}
