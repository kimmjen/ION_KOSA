package homework.day09.bmi;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class bmiManager {

    //
    Scanner sc = new Scanner(System.in);
    ArrayList<bmi> list = new ArrayList<bmi>();

    // 1.
    public void insertInfo() {
        String name;
        int age;
        double height, weight;

        System.out.println("\n추가할 사람의 정보를 입력하세요.");
        System.out.print("이름 : ");
        name = sc.next();
        System.out.print("나이 : ");
        age = sc.nextInt();
        System.out.print("키 : ");
        height = sc.nextDouble();
        System.out.print("몸무게 : ");
        weight = sc.nextDouble();

        if (list.add(new bmi(name, age, height, weight))) {
            System.out.println(name + " 님의 정보를 추가하였습니다.");
        } else {
            System.out.println(name + " 님의 정보를 추가하지 못했습니다.");
        }
    }

    // 2.
    public void deleteInfo() {
        String name;
        int age;
        boolean flag = true;

        System.out.println("\n삭제할 사람의 정보를 입력하세요.");
        System.out.print("이름 : ");
        name = sc.next();
        System.out.print("나이 : ");
        age = sc.nextInt();

        if (list.isEmpty()) {
            System.out.println("리스트가 비었습니다.");
        } else {

            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).getName().equals(name) && list.get(i).getAge() == age) {
                    list.remove(i);
                    flag = false;
                    System.out.println(name + " 님의 정보를 삭제하였습니다.");
                    break;
                }
            }
            if (flag) {
                System.out.println(name + " 님의 정보가 없습니다.");
            }
        }
    }

    // 3.
    public void listInfo() {
        System.out.println("\n사람들의 정보를 출력합니다.");

        if (list.isEmpty()) {
            System.out.println("리스트가 비었습니다.");
        } else {

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    // 4.
    public void saveInfo() {
        try {
            StringBuilder sb = new StringBuilder();
            FileOutputStream os = new FileOutputStream("bmi.txt");

            System.out.println("\n사람들의 정보를 저장합니다.");

            if (list.isEmpty()) {
                System.out.println("리스트가 비었습니다.");
            } else {

                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i).toString());
                }
            }
            os.write(sb.toString().getBytes());

            System.out.println("파일을 저장하였습니다.");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("파일 저장에 실패하였습니다.");
        }
    }
}
