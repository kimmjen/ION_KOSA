package homework.day07.P_01_Tran_cla;

public class Main {
    public static void main(String[] args) {

        Tran[] tr = new Tran[4];
        tr[0] = new Subway();
        tr[1] = new Bus();
        tr[2] = new Bicycle();
        tr[3] = new Plane();

        for (int i = 0; i < tr.length; i++) {
            tr[i].start();
            tr[i].stop();
        }
    }
}
