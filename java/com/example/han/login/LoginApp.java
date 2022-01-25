package com.example.han.login;

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
