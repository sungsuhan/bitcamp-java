package com.example.han.calc;

/**
 * 전화번호와 메시지를 받아서 전송하는 어플을 만드시오
 * 전화번호 String telno, String message
 **/

public class KakaoApp {

    public static String KAKAO_APP = "<카카오 번호랑 메시지 입력>";
    String telno;
    String message;

    public String kakao(String telno, String message){

        this.telno = telno;
        this.message = message;

        return String.format("전화번호는 %s 이고 메시지는 %s 입니다", this.telno, this.message);

    }
}
