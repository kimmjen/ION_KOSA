package homework.day07.P_03_Emp_inherit;

import java.util.Scanner;

public class Sales extends Regular {
    //
    public Sales(Scanner sc) {
        super(sc);
        salesSal();
    }

    //
    public void salesSal() {
        super.setSal((int) (getSal() * 0.8));
    }
}
