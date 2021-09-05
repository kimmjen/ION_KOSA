package homework.day08.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CustomerManager cm = new CustomerManager();

        System.out.println("고객 정보 프로그램");
        System.out.println(" 1. 고객 추가\n 2. 고객 삭제\n 3. 고객 리스트 출력\n 4. 고객 수정\n 5. 시스템 종료");
        while (true) {
            int num;
            do {
                System.out.print("원하시는 작업의 번호를 입력해주세요.(1 ~ 5) : ");
                num = sc.nextInt();
            } while (num < 1 || num > 5);

            switch (num) {
                case 1:
                    Customer c = new Customer();
                    System.out.print("이름 : ");
                    c.setName(sc.next());
                    System.out.print("주소 : ");
                    c.setAddrss(sc.next());
                    System.out.print("연락처 : ");
                    c.setPhone(sc.next());
                    cm.addCustomer(c);
                    break;
                case 2:
                    System.out.print("삭제할 고객 이름 : ");
                    cm.deleteCustomer(sc.next());
                    break;
                case 3:
                    System.out.print("고객 리스트 출력");
                    cm.showCustomer();
                    break;
                case 4:
                    System.out.print("수정할 고객 이름 : ");
                    cm.modifyCustomer(sc.next());
                    break;
                default:
                    System.out.println("시스템 종료");
                    System.exit(0);

            }
            sc.close();
        }
    }
}
