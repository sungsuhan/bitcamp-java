package com.example.han.kakao;

/**
 * packageName: com.example.han.kakao
 * fileName        : KakaoApp2.java
 * author          : sungsuhan
 * date            : 2022-01-25
 * desc            : 이름과 소수점 숫자를 전송하는 앱
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-25         sungsuhan        최초 생성
 **/
public class KakaoApp2 {
    public static String KAKAO = "카카오에서 당신의 이름과 선택한 소수를 알고 싶습니다";
    private String name;
    private double num;

    public String info(String name, double num) {

        this.name = name;
        this.num = num;

        return String.format("제 이름은 %s 이고 제가 선택한 소수는 %f 입니다", this.name, this.num);











    }
}
