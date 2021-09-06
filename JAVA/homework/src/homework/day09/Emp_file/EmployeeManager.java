package homework.day09.Emp_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class EmployeeManager {
    static int id = 0; // id 를 static으로 두므로써 다른 EmployView를 선언하면 다른 파일에 저장할 수 있음.
    Vector<Employee> employs;
    FileOutputStream input;

    public EmployeeManager() throws IOException { // FileOutputStream, Vector 등 초기화
        employs = new Vector<Employee>();
        File file = new File("Employs" + id++ + ".txt");
        if (!file.exists())
            file.createNewFile();
        input = new FileOutputStream(file);// true); -> 넣어주면 이어쓰기 가능.
    }

    public Boolean addEmploy() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("어떤 직원입니까? (정규직 : 1, 판매원 : 2, 파트타임 : 3)");
            int cmd = new Integer(input.readLine());
            if (cmd < 1 || cmd > 3)
                throw new IOException();
            String name, phone, partition, position;
            int pay, workTime, workDay;
            double commition;
            System.out.println("이름을 입력해 주세요.");
            name = input.readLine();
            System.out.println("핸드폰 번호를 입력해 주세요.");
            phone = input.readLine();
            System.out.println("부서를 입력해 주세요.");
            partition = input.readLine();
            System.out.println("직책를 입력해 주세요.");
            position = input.readLine();

            Employee employ = null;

            switch (cmd) {
                case 1:// 정규직
                    System.out.println("월급을 입력해주세요.");
                    pay = new Integer(input.readLine());
                    employ = new Regular(name, phone, partition, position, pay);
                    break;
                case 2:// 판매원
                    System.out.println("월급을 입력해주세요.");
                    pay = new Integer(input.readLine());
                    System.out.println("커미션을 입력해 주세요.");
                    commition = new Double(input.readLine());
                    employ = new Sales(name, phone, partition, position, pay, commition);
                    break;
                case 3:// 파트직
                    System.out.println("일한 시간을 입력해주세요.");
                    workTime = new Integer(input.readLine());
                    System.out.println("일한 날을 입력해주세요.");
                    workDay = new Integer(input.readLine());
                    employ = new PartTime(name, phone, partition, position, workTime, workDay);
                    break;
            }
            employs.add(employ);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("입력이 잘못 되었습니다.");
            return false;
        }
    }

    public Boolean write() {
        try {
            int i = 1;
            for (Employee employ : employs) {
                String str = i++ + " : " + employ + "\t\n";
                input.write(str.getBytes());
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}