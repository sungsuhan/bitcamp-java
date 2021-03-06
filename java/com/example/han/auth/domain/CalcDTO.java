package com.example.han.auth.domain;

import com.example.han.oop.domain.CelPhone;
import com.example.han.oop.domain.IPhone;
import com.example.han.oop.domain.Phone;

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

public class CalcDTO {
    private final static CalcDTO calDTO = new CalcDTO();
    private CalcDTO(){}
    public static CalcDTO getInstance() {return calDTO;}

    public final static String CALC_TITLE = "<계산기>";
    private int num1;
    private String opcode;
    private int num2;

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public String getOpcode() {
        return opcode;
    }
    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
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
}
