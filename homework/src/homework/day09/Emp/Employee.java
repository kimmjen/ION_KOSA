package homework.day09.Emp;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);

    public void addEmployee() throws IOException {

        String a = "";
        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("employee.exe", true));
        System.out.print("이름 : ");
        os.write((sc.next() + " ").getBytes());
        System.out.print("직급 : ");
        os.write((sc.next() + " ").getBytes());
        System.out.print("부서 : ");
        os.write((sc.next() + " \r\n").getBytes());

        os.close();
    }

    public void listEmployee() throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new FileReader("employee.txt"));

        String line = "";

        while ((line = br.readLine()) != null) {

            String info[] = line.split(" ");
            System.out.print("\n이름 : " + info[0]);
            System.out.print("\t직급 : " + info[1]);
            System.out.print("\t부서 : " + info[2]);
        }
        br.close();
    }

    public void removeEmployee() throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
        String who = "";
        System.out.print("지울 사람 : ");
        who = sc.next();

        String line = "";
        String dummy = "";

        while ((line = br.readLine()) != null) {

            String info[] = line.split(" ");

            if (info[0].equals(who)) {
                continue;
            }
            dummy += line + "\r\n";

        }
        FileWriter fw = new FileWriter("employee.txt");
        fw.write(dummy);
        fw.close();
        br.close();

    }

}
