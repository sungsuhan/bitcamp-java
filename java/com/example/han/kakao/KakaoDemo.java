package com.example.han.kakao;
/**
 * packageName: com.example.han.calc
 * fileName        : KakaoDemo.java
 * author          : sungsuhan
 * date            : 2022-01-24
 * desc            : 카카오 앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 */


import com.example.han.kakao.KakaoApp;

import java.util.Scanner;

public class KakaoDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        KakaoApp kakaoApp = new KakaoApp();

        System.out.println(KakaoApp.KAKAO_APP);

        System.out.println("전화번호 입력");
        System.out.println("메시지 입력");

        String telno = scanner.next();
        String message = scanner.next();

        System.out.println("전송 완료");

        String res = kakaoApp.kakao(telno, message);

        System.out.println(res);

    }
}