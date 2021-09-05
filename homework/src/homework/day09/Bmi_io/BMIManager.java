package homework.day09.Bmi_io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BMIManager {
    // member variable
    private BufferedReader br;
    private ArrayList<BMI> list;

    // constructor
    public BMIManager() {
        br = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList<BMI>();
    }

    // 프로그램 시작 method
    public void programStart() throws NumberFormatException, IOException {
        System.out.println("-- 비만도 측정 프로그램 --");

        while (true) {
            System.out.println("메뉴를 선택하세요.");
            System.out.println("1 : 추가");
            System.out.println("2 : 삭제");
            System.out.println("3 : 출력");
            System.out.println("4 : 저장");
            System.out.println("5 : 종료");
            System.out.print("입력 : ");

            switch (Integer.parseInt(br.readLine())) {
                case 1:
                    addInfo();
                    break;
                case 2:
                    delInfo();
                    break;
                case 3:
                    printInfo();
                    break;
                case 4:
                    saveInfo();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("메뉴를 잘못 선택하셨습니다.");
                    break;

            }
            System.out.println();
        }
    }

    // 1. 추가 method
    public void addInfo() throws IOException {
        String name;
        int age;
        double height, weight;

        System.out.println("\n추가할 사람의 정보를 입력하세요.");
        System.out.print("이름 : ");
        name = br.readLine();
        System.out.print("나이 : ");
        age = Integer.parseInt(br.readLine());
        System.out.print("키 : ");
        height = Double.parseDouble(br.readLine());
        System.out.print("몸무게 : ");
        weight = Double.parseDouble(br.readLine());

        if (list.add(new BMI(name, age, height, weight))) {
            System.out.println(name + "님의 정보를 추가하였습니다.");
        } else {
            System.out.println(name + "님의 정보를 추가하지 못했습니다.");
        }
    }

    // 2. 삭제 method
    public void delInfo() throws IOException {
        String name;
        int age;
        boolean flag = true;

        System.out.println("\n삭제할 사람의 정보를 입력하세요.");
        System.out.print("이름 : ");
        name = br.readLine();
        System.out.print("나이 : ");
        age = Integer.parseInt(br.readLine());

        if (list.isEmpty()) {
            System.out.println("리스트가 비었습니다.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(name) && list.get(i).getAge() == age) {
                    list.remove(i);
                    flag = false;
                    System.out.println(name + "님의 정보를 삭제하였습니다.");
                    break;
                }
            }

            if (flag) {
                System.out.println(name + "님의 정보가 없습니다.");
            }
        }
    }

    // 3. 출력 method
    public void printInfo() {
        System.out.println("\n사람들의 정보를 출력합니다.");

        if (list.isEmpty()) {
            System.out.println("리스트가 비었습니다.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    // 4. 저장 method
    @SuppressWarnings("resource")
    public void saveInfo() {
        try {
            StringBuilder sb = new StringBuilder();
            FileOutputStream fos = new FileOutputStream("bmi.txt");

            System.out.println("\n사람들의 정보를 저장합니다.");

            if (list.isEmpty()) {
                System.out.println("리스트가 비었습니다.");
            } else {
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i).toString());
                }
            }

            fos.write(sb.toString().getBytes());

            System.out.println("파일을 저장하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장에 실패하였습니다.");
        }
    }

    // 5. 종료 method
    public void exit() {
        System.out.println("\n프로그램을 종료합니다.");
        System.exit(0);
    }
}