package com.example.han.service2;
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


import com.example.han.domain2.KakaoDTO;

import java.util.Scanner;

public class KakaoService {
    public String execute(KakaoDTO kakao) {

        return String.format("전화번호는 %s 이고 메시지는 %s 입니다", kakao.getTelno(), kakao.getMessage());

    }
}