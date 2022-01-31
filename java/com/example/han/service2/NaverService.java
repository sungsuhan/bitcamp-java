package com.example.han.service2;

import com.example.han.domain2.NaverDTO;

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
public class NaverService {
    public String execute(NaverDTO naver) {

        String res = "ID : %s 사용자 로그인 성공";

        return String.format(res, naver.getId());

    }
}
