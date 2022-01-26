package com.example.han.grade;

import java.util.Scanner;

/**
 * packageName: com.example.han.grade
 * fileName        : GradeDemo2.java
 * author          : sungsuhan
 * date            : 2022-01-26
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-26         sungsuhan        최초 생성
 **/
public class GradeDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp2 gradeApp2 = new GradeApp2();

        System.out.println("이름");
        String name = scanner.next();
        System.out.println("국어 점수");
        int kor = scanner.nextInt();
        System.out.println("영어 점수");
        int eng = scanner.nextInt();
        System.out.println("수학 점수");
        int math = scanner.nextInt();

        String res = gradeApp2.getGrade(name, kor, eng, math);

        System.out.println(res);

    }
}
