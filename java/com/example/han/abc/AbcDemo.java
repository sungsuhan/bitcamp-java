package com.example.han.abc;

import java.util.Scanner;

/**
 * packageName: com.example.han.abc
 * fileName        : AbcDemo.java
 * author          : sungsuhan
 * date            : 2022-01-26
 * desc            : abc앱 실행하는 컨트롤러
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-26         sungsuhan        최초 생성
 **/
public class AbcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbcApp abcApp = new AbcApp();

        String res = abcApp.getAbc();
        System.out.println(res);

    }
}
