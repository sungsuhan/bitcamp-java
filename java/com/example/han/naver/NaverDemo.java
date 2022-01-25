package com.example.han.naver;

import java.util.Scanner;

/**
 * packageName: com.example.han.naver
 * fileName        : NaverDemo.java
 * author          : sungsuhan
 * date            : 2022-01-25
 * desc            : 네이버앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 **/
public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();

        System.out.println(NaverApp.TITLE);

        System.out.println("ID");
        String id = scanner.next();

        System.out.println("PW");
        String pw = scanner.next();

        String res = naverApp.naverlogin(id, pw);

        System.out.println(res);









    }
}
