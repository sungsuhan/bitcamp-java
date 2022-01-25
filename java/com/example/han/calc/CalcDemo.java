package com.example.han.calc;

/**
 * 숫자 2개와 연산자 1개를 받아서 계산하는 계산기를 코딩하시오
 * int, String
 **/

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
