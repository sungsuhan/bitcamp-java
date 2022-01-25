package com.example.han.calc;
/**
 * packageName: com.example.han.calc
 * fileName        : CalcApp.java
 * author          : sungsuhan
 * date            : 2022-01-24
 * desc            : 숫자 2개와 더하기 연산자 1개를 받아서 계산하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 */

public class CalcApp {

    public static String CALC_APP = "<더하기 계산기>";
    int num1;
    int num2;
    String opcode;

    String calc(int num1, String opcode, int num2){

        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;

        int num3 = num1 + num2;

        //return num1 + " " + opcode + " " + num2 + " = " + num3;
        return String.format("%d %s %d = %d", this.num1, this.opcode, this.num2, num3);





    }
}
