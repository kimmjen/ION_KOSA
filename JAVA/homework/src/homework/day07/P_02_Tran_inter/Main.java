package homework.day07.P_02_Tran_inter;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Tran[] tr = new Tran[2];

        tr[0] = new Bus();
        tr[1] = new Plane();

        for (int i = 0; i < tr.length; i++) {
            tr[i].start();
            tr[i].stop();
        }
    }
}
