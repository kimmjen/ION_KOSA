package homework.day07.P_01_Tran_cla;

public class Plane extends Tran {

    String name = "비행기";

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println(name + " 출발");

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println(name + " 정지");

    }

}
