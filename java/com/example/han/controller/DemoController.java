package com.example.han.controller;

import com.example.han.calc.CalcDemo;

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
        CalcDemo calcDemo = new CalcDemo();
        System.out.println("메뉴 선택");
        String menu = "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
//        for (int i=0; i<2; i++) {
//            System.out.println(menu);
//
//            String select = scanner.next();
//
//            String res = "";
//
//            switch (select) {
//                case "1" : res = "BMI"; break;
//                case "2" : res = "CALC"; break;
//                case "3" : res = "SEARCH"; break;
//                case "4" : res = "GRADE"; break;
//                case "5" : res = "LOGIN"; break;
//                default  : res = "1~5만 누르세요"; break;
//            }
//            System.out.println(res);
//        }
        while (true) {
            System.out.println(menu);

            String select = scanner.next();

            String res = "";

            switch (select) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1" : res = "BMI";
                    break;
                case "2" : res = "CALC";
                    calcDemo.execute();
                    break;
                case "3" : res = "SEARCH";
                    break;
                case "4" : res = "GRADE";
                    break;
                case "5" : res = "LOGIN";
                    break;
                default  : res = "1~5만 누르세요";
                    break;
            }
            System.out.println(res);
        }
    }
}
