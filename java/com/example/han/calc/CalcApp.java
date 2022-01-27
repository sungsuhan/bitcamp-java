package com.example.han.calc;
/**
 * packageName: com.example.han.calc
 * fileName        : CalcApp.java
 * author          : sungsuhan
 * date            : 2022-01-24
 * desc            : 숫자 2개와 연산자 1개를 받아서 계산하는 앱
 * ============================================================
 * DATE              AUTHOR        NOTE
 * ============================================================
 * 2022-01-25         sungsuhan        최초 생성
 **/

public class CalcApp {

    public static String CALC_TITLE = "<계산기>";
    private int num1;
    private String opcode;
    private int num2;

    public String getCalc(int num1, String opcode, int num2) {

        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;

        int res = 0;

        /*
        if(opcode.equals("+")){
            res = this.num1 + this.num2;
        }else if(opcode.equals("-")){
            res = this.num1 - this.num2;
        }else if(opcode.equals("*")){
            res = this.num1 * this.num2;
        }else if(opcode.equals("/")){
            res = this.num1 / this.num2;
        }
        */


        switch(opcode){
            case "+" : res = this.num1 + this.num2; break;
            case "-" : res = this.num1 - this.num2; break;
            case "*" : res = this.num1 * this.num2; break;
            case "/" : res = this.num1 / this.num2; break;
        }


       return String.format("%d %s %d = %d", this.num1, this.opcode, this.num2, res);


    }
}
