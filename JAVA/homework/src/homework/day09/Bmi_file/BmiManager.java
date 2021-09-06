package homework.day09.Bmi_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BmiManager extends Bmi {

    static HashMap<Integer, Bmi> bmi = new HashMap<Integer, Bmi>();
    Scanner sc = new Scanner(System.in);

    // 추가
    public static void add() {

        bmi.put(Bmi.cnt, new Bmi());
        calcBmi(Bmi.cnt);
        Bmi.cnt++;

    }

    // bmi 계산
    public static void calcBmi(int i) {

        bmi.get(i).setBmi((double) bmi.get(i).getWeight()
                / (((double) bmi.get(i).getHeight() / 100.0) * ((double) bmi.get(i).getHeight() / 100.0)));
    }

    // 삭제
    public static void del() {

        int i;

        while (true) {
            System.out.print("삭제를 원하시는 번호 입력 : ");
            i = new Scanner(System.in).nextInt();

            if (check(i))
                break;
            else {
                System.out.println("없는 번호입니다.");
                continue;
            }
        }
        bmi.remove(i);
        System.out.println("삭제 되었습니다.");

    }

    // bmi 확인
    public static boolean check(int i) {

        if (bmi.containsKey(i))
            return true;
        return false;
    }

    // 리스트 보기
    public static void show() {

        int i = 1;
        try {
            FileOutputStream os = new FileOutputStream("BMI.txt"); // 상대경로
            Set set = bmi.entrySet();
            Iterator it = set.iterator();

            while (it.hasNext()) {

                Map.Entry e = (Map.Entry) it.next();
                String str = bmi.get(e.getKey()).toString() + "\n ==> "
                        + judgement((int) (bmi.get(e.getKey()).getBmi() * 10)) + "\r\n\n";
                os.write(str.getBytes());

            }
            System.out.println("BMI.text 저장 완료");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // bmi 판단
    private static String judgement(int i) {

        if (185 > i)
            return "체중 부족";
        else if (185 <= i && 229 >= i)
            return "정상";
        else if (230 <= i && 249 >= i)
            return "과체중";
        else
            return "과체중";
    }
}
