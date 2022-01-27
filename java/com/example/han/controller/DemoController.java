package com.example.han.controller;

import com.example.han.bmi.BmiApp;
import com.example.han.bmi.BmiDemo;
import com.example.han.calc.CalcApp;
import com.example.han.calc.CalcDemo;
import com.example.han.google.GoogleApp;
import com.example.han.google.GoogleDemo;
import com.example.han.grade.GradeApp;
import com.example.han.grade.GradeDemo;
import com.example.han.login.LoginApp;
import com.example.han.login.LoginDemo;

import java.util.Scanner;

/**
 * packageName: com.example.han.controller
 * fileName        : DemoController.java
 * author          : sungsuhan
 * date            : 2022-01-27
 * desc            : 생성한 데모들의 종합 컨트롤러
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-27         sungsuhan        최초 생성
 **/
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDemo bmiDemo = new BmiDemo();
        CalcDemo calcDemo = new CalcDemo();
        GoogleDemo googleDemo = new GoogleDemo();
        GradeDemo gradeDemo = new GradeDemo();
        LoginDemo loginDemo = new LoginDemo();
        System.out.println("메뉴 선택");
        String menu = "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
    /*
        for (int i=0; i<2; i++) {
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
            switch (select) {
                case "1" : res = "BMI"; break;
                case "2" : res = "CALC"; break;
                case "3" : res = "SEARCH"; break;
                case "4" : res = "GRADE"; break;
                case "5" : res = "LOGIN"; break;
                default  : res = "1~5만 누르세요"; break;
            }
            System.out.println(res);
        }
    */
        while (true) {
            System.out.println(menu);

            String select = scanner.next();

            String res = "";

            switch (select) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    System.out.println(BmiApp.BMI + "\n이름, 키, 몸무게 입력");
                    res = bmiDemo.execute(scanner.next(), scanner.next(), scanner.next());
                    break;
                case "2" :
                    System.out.println(CalcApp.CALC_APP + "\n숫자1, 연산자, 숫자2 입력");
                    res = calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt());
                    break;
                case "3" :
                    System.out.println(GoogleApp.TITLE + "\n[Google 검색 또는 URL 입력]");
                    res = googleDemo.execute(scanner.next());
                    break;
                case "4" :
                    System.out.println(GradeApp.GRADE_TITLE + "\n이름, 국어점수, 영어점수, 수학점수 입력");
                    res = gradeDemo.execute(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                case "5" :
                    System.out.println(LoginApp.LOGIN_APP + "\nID, PW, 이름 입력");
                    res = loginDemo.execute(scanner.next(), scanner.next(), scanner.next());
                    break;
                default  : res = "1~5만 누르세요";
                    break;
            }
            System.out.println(res);
        }
    }
}
