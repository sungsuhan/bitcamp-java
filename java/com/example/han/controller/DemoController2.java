package com.example.han.controller;

import java.util.Scanner;

/**
 * packageName: com.example.han.controller
 * fileName        : DemoController2.java
 * author          : sungsuhan
 * date            : 2022-01-27
 * desc            : 기본구조 컨트롤러
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-27         sungsuhan        최초 생성
 **/
public class DemoController2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("MENU : 0.EXIT");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("EXIT"); return;
                case "1" : break;
                default:
                    System.out.println("Wrong MENU"); break;

            }
        }
    }
}
