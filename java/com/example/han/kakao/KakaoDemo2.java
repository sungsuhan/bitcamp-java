package com.example.han.kakao;

import java.util.Scanner;

/**
 * packageName: com.example.han.kakao
 * fileName        : KakaoDemo2.java
 * author          : sungsuhan
 * date            : 2022-01-25
 * desc            : 카카오 앱2를 실행하는 데모
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-25         sungsuhan        최초 생성
 **/
public class KakaoDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KakaoApp2 kakaoApp2 = new KakaoApp2();

        System.out.println(KakaoApp2.KAKAO);

        System.out.println("이름은 무엇입니까?");
        String name = scanner.next();

        System.out.println("선택한 소수는 무엇입니까?");
        double num = scanner.nextDouble();

        String res = kakaoApp2.info(name, num);

        System.out.println(res);














    }
}
