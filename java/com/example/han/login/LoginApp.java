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
    static String PASSWORD = "abc";

    String getLog(String id, String pw, String name) {

        this.id = id;
        this.pw = pw;
        this.name = name;

        /*
        if(pw.equals(PASSWORD)){
            res = String.format("%s 님의 비번 %s 가 맞습니다, 로그인 성공", this.name, this.pw);
        }else {
            res = String.format("%s 님의 ID는 맞고 비번 %s 가 틀립니다, 로그인 실패", this.id, this.pw);
        }
         */

        /*
        switch (pw) {
            case "abc" : res = String.format("%s 님의 비번 %s 가 맞습니다, 로그인 성공", this.name, this.pw); break;
            default : res = String.format("%s 님의 ID는 맞고 비번 %s 가 틀립니다, 로그인 실패", this.id, this.pw); break;
        }
         */

        return (pw.equals(PASSWORD)) ? String.format("%s 님의 비번 %s 가 맞습니다, 로그인 성공", this.name, this.pw)
                : String.format("%s 님의 ID는 맞고 비번 %s 가 틀립니다, 로그인 실패", this.id, this.pw);






    }
}
