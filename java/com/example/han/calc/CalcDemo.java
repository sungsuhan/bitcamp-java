package com.example.han.calc;
/**
 * packageName: com.example.han.calc
 * fileName        : CalcDemo.java
 * author          : sungsuhan
 * date            : 2022-01-24
 * desc            : 계산기 앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 */

import com.example.han.calc.CalcApp;

import java.util.Scanner;

public class CalcDemo {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();

        System.out.println(CalcApp.CALC_APP);

        System.out.println("첫번째 숫자 : ");
        int num1 = scanner.nextInt();
        System.out.println("계산 기호");
        String opcode = scanner.next();
        System.out.println("두번째 숫자 : ");
        int num2 = scanner.nextInt();

        System.out.print("답 : ");

        String res = calcApp.calc(num1, opcode, num2);

        System.out.println(res);



















    }
}
