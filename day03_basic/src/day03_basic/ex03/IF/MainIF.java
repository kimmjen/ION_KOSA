package day03_basic.ex03.IF;

import java.util.Scanner;

public class MainIF {
    public static void main(String[] args) {
        int score = 88;
        String grade = null; // 8byte
        char grade2 = ' '; // 2byte
        
        if (score >= 90) grade = "A";
        else if (score >= 80) grade = "B";
        else if (score >= 70) grade = "C";
        else if (score >= 60) grade = "D";
        else grade = "F";
        System.out.println(score + "점 ==> " + grade + "학점" );
        
        System.out.println("===============");
        
        if (score >= 90) grade2 = 'A';
        else if (score >= 80) grade2 = 'B';
        else if (score >= 70) grade2 = 'C';
        else if (score >= 60) grade2 = 'D';
        else grade2 = 'F';
        System.out.println(score + "점 ==> " + grade2 + "학점" );
        
        System.out.println("===============");
        
        // �룊洹�(�븰�젏) 援ы븯�뒗 �봽濡쒓렇�옩 留뚮뱾湲� (if)
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
        System.out.println("===============");
        
        int n;
        System.out.println("점수입력 : " );
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        if (n >= 90 && n <= 100) {
        	System.out.println("학점: A");
        } else if (n >= 80 && n <90) {
        	System.out.println("학점: B");
        } else if (n >= 70 && n <80) {
        	System.out.println("학점: C");
        } else if (n >= 60 && n <70) {
        	System.out.println("학점: D");
        } else {
        	System.out.println("학점: F");
        }
        
    }
}
