package com.example.han.login;
/**
 * packageName: com.example.han.calc
 * fileName        : LoginApp.java
 * author          : sungsuhan
 * date            : 2022-01-24
 * desc            : 로그인 화면을 나타내는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 */
public class LoginApp {

    public static String LOGIN_APP = "<로그인 창>";
    private String id;
    private String pw;
    private String name;

    String log(String id, String pw, String name) {

        this.id = id;
        this.pw = pw;
        this.name = name;

        return String.format("ID : %s, PW : %s, Name : %s", this.id, this.pw, this.name);




    }
}
