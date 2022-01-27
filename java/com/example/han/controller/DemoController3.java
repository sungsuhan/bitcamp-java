package com.example.han.controller;

import java.util.Scanner;

/**
 * packageName: com.example.han.controller
 * fileName        : DemoController3.java
 * author          : sungsuhan
 * date            : 2022-01-27
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-27         sungsuhan        최초 생성
 **/
public class DemoController3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[Menu] 0.EXIT \n" +
                    "1.Heap \t" +
                    "2.Hash \t" +
                    "3.Stack \n"
                    );

            switch (scanner.next()) {
                case "0" :
                    System.out.println("EXIT"); return;
                case "1" :
                    System.out.println("a"); break;
                default:
                    System.out.println("Wrong"); break;
            }
        }
    }
}
