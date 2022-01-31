package com.example.han.domain2;
/**
 * packageName: com.example.han.calc
 * fileName        : KakaoApp.java
 * author          : sungsuhan
 * date            : 2022-01-24
 * desc            : 전화번호와 메시지를 받아서 전송하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 */
/**
 * 전화번호와 메시지를 받아서 전송하는 어플을 만드시오
 * 전화번호 String telno, String message
 **/

public class KakaoDTO {

    public static String KAKAO_APP = "<카카오 번호랑 메시지 입력>";
    private String telno;
    private String message;

    public String getTelno() {
        return telno;
    }
    public void setTelno(String telno) {
        this.telno = telno;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
