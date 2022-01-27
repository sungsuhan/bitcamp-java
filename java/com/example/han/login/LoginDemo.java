package com.example.han.login;
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
import java.util.Scanner;

public class LoginDemo {
    public String execute(String id,String pw,String name){
        LoginApp loginApp = new LoginApp();

        return loginApp.getLog(id, pw, name);

    }
}
