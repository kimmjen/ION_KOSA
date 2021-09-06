package homework.day09.Emp_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public Main() throws IOException {
        EmployeeManager employView = new EmployeeManager();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.print("직원을 계속 추가 하시겠습니까? (y, n)");
                String cmd = input.readLine();
                if (cmd.equals("n"))
                    break;
                if (!cmd.equals("y"))
                    throw new IOException();
                System.out.println(employView.addEmploy() ? "성공" : "실패");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("입력이 잘못되었습니다. 처음부터 다시 시작합니다.");
                continue;
            }
        }
        System.out.println(employView.write() ? "성공" : "실패");
    }

    public static void main(String[] args) throws IOException {
        Main Main = new Main();
    }
}
