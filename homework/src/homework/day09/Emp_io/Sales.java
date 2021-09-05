package homework.day09.Emp_io;

import java.util.Scanner;

public class Sales extends Regular {

    public Sales(Scanner sc) {
        super(sc);
        salesSal();
    }

    public void salesSal() {
        super.setSal((int) (getSal() * 0.8));
    }

}
