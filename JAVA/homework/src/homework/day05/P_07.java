package homework.day05;

import java.util.Scanner;

public class P_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("info() 입력");

        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("연락처 : ");
        String phone = sc.next();

        System.out.print("주소 : ");
        String address = sc.next();

        info(name, phone, address);

        sc.close();
    }

    public static void info(String name, String phone, String address) {
        System.out.println("info() 출력");
        System.out.println("이름 : " + name);
        System.out.println("연락처 : " + phone);
        System.out.println("주소 : " + address);
    }
}
