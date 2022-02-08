package com.example.han.member.domain;

/**
 * packageName: com.example.han.google
 * fileName        : GoogleApp.java
 * author          : sungsuhan
 * date            : 2022-01-25
 * desc            : 구글 홈화면 앱
 * [클래스변수]: public static String TITLE
 * [인스턴스변수]: private String search
 * [로컬변수]: String res
 * [파라미터]: String search
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 **/
public class GoogleDTO {
    public static String GOOGLE_TITLE = "Google";
    private String search;

    public String getSearch() {
        return search;
    }
    public void setSearch(String search) {
        this.search = search;
    }

}
