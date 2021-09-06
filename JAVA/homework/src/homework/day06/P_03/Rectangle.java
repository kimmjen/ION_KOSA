package homework.day06.P_03;

public class Rectangle extends Point {
    private int x2, y2;

    public Rectangle() {
        super();
    }

    public Rectangle(int x, int y) {
        super(x, y);

    }

    public Rectangle(int x, int y, int x2, int y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void disp() {
        super.disp();
        System.out.println(", x2 = " + x2 + ", y2 = " + y2);
    }

    public static void main(String[] args) {

        Rectangle rec = new Rectangle(2, 2, 2, 2);
        rec.disp();
    }
}
