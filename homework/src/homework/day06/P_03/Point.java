package homework.day06.P_03;

public class Point {

    protected int x, y;

    public Point() {
        // this(x, y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void disp() {
        System.out.print("x = " + x + ", y = " + y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
