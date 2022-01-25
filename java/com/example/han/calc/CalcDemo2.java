package com.example.han.calc;

import java.util.Scanner;

public class CalcDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp2 calcApp2 = new CalcApp2();

        System.out.println(CalcApp.CALC_APP);

        System.out.println("첫번째 숫자");
        int a = scanner.nextInt();
        System.out.println("덧셈 기호");
        String opcode = scanner.next();
        System.out.println("두번째 숫자");
        int b = scanner.nextInt();

        System.out.print("덧셈 결과 : ");

        String res = calcApp2.cal(a, opcode, b);

        System.out.println(res);


    }
}
