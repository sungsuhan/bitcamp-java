package com.example.han.member;

import java.util.Scanner;

/**
 * packageName: com.example.han.member
 * fileName        : MemberDemo.java
 * author          : sungsuhan
 * date            : 2022-01-26
 * desc            : 멤버 앱 실행하는 컨트롤러
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-26         sungsuhan        최초 생성
 **/
public class MemberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberApp memberApp = new MemberApp();

        String res = memberApp.getMember();
        System.out.println(res);




    }

}
