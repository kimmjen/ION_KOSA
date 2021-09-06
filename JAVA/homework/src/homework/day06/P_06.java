package homework.day06;

public class P_06 {
    private int ch;
    private String color, sound;

    public P_06() {
        ch = 1;
        color = "color_test";
        sound = "sound_test";
    }

    public P_06(int ch, String color, String sound) {
        this.ch = ch;
        this.color = color;
        this.color = sound;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void output() {
        System.out.println("채널 : " + ch);
        System.out.println("색상 : " + color);
        System.out.println("사운드 : " + sound);
    }

    public static void main(String[] args) {
        P_06 tv = new P_06();
        tv.output();
    }
}
