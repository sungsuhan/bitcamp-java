package com.example.han.calc;

public class CalcApp2 {

    public static String CALC_APP2 = "<계산기>";
    int a;
    int b;
    String opcode;

    String cal(int a, String opcode, int b){

        this.a = a;
        this.opcode = opcode;
        this.b = b;

        int c = a + b;

        return String.format("%d %s %d = %d", this.a, this.opcode, this.b, c);
    }
}
