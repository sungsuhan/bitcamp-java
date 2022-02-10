package com.example.han.auth.domain;
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
public class UserDTO {
    private final static UserDTO userDTO = new UserDTO();
    private UserDTO() {}
    public static UserDTO getInstance() {return userDTO;}

    public static String LOGIN_TITLE = "<로그인 창>";
    private String id;
    private String pw;
    private String name;
    static String PASSWORD = "abc";

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPASSWORD() {
        return PASSWORD;
    }
    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

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
}
