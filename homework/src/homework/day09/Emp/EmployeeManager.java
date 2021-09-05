package homework.day09.Emp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {

        int i = 1;
        Scanner sc = new Scanner(System.in);

        try {

            OutputStream os = new FileOutputStream("Employee.txt"); // 상대경로
            while (true) {

                System.out.println(i + "번째 사원의 이름을 입력하세요. : ");
                String name = sc.nextLine() + "\r\n";

                if (name.toUpperCase().equals("EXIT\r\n"))
                    break;

                System.out.print("직급을 입력하세요. : ");
                String position = sc.nextLine() + "\r\n";
                System.out.print("부서를 입력하세요. : ");
                String dept = sc.nextLine() + "\r\n\n";

                String str = i++ + "번째 사원\r\n" + name + position + dept;
                os.write(str.getBytes());
            }
            System.out.println("Employee.txt 저장 완료");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
