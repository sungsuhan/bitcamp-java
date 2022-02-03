package com.example.han.service;

import com.example.han.domain.LoginDTO;

/**
 * packageName: com.example.han.calc
 * fileName        : LoginDemo.java
 * author          : sungsuhan
 * date            : 2022-01-24
 * desc            : 로그인 앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 */

public class LoginService {
    public String execute(LoginDTO login){

        return (login.getPw().equals(login.getPASSWORD())) ? String.format("%s 님의 비번 %s 가 맞습니다, 로그인 성공", login.getName(), login.getPw())
                : String.format("%s 님의 ID는 맞고 비번 %s 가 틀립니다, 로그인 실패", login.getName(), login.getPw());

    }
}
