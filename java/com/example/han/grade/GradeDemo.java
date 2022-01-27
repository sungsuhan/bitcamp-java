package com.example.han.grade;

import java.util.Scanner;

/**
 * packageName: com.example.han.grade
 * fileName        : GradeDemo.java
 * author          : sungsuhan
 * date            : 2022-01-26
 * desc            : grade앱 실행하는 컨트롤러
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-26         sungsuhan        최초 생성
 **/
public class GradeDemo {
    public String execute(String name,int kor,int eng,int math) {
        GradeApp gradeApp = new GradeApp();

        return gradeApp.getGrade(name, kor, eng, math);

    }
}
