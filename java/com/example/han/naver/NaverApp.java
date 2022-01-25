package com.example.han.naver;

/**
 * packageName: com.example.han.naver
 * fileName        : NaverApp.java
 * author          : sungsuhan
 * date            : 2022-01-25
 * desc            : 네이버 로그인 화면 앱
 * [클래스변수]: TITLE
 * [인스턴스변수]: id, pw
 * [로컬변수]: res
 * [파라미터]: id, pw
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 **/
public class NaverApp {
    public static String TITLE = "NAVER";
    private String id;
    private String pw;

    String naverlogin(String id, String pw){

        this.id = id;
        this.pw = pw;

        String res = "%s인 사용자 로그인 성공";

        return String.format(res,this.id);






    }
}
