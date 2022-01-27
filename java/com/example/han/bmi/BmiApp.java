package com.example.han.bmi;

/**
 * packageName: com.example.han.bmi
 * fileName        : BmiApp.java
 * author          : sungsuhan
 * date            : 2022-01-25
 * desc            : 무조건 정상인 bmi 앱
 * [클래스변수]: BMI
 * [인스턴스변수]: name, gender, height, weight
 * [로컬변수]: res
 * [파라미터]: name, gender, height, weight
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 **/
public class BmiApp {
    public static String BMI_TITLE = "무조건 정상인 BMI 측정기";
    private String name;
    private String height;
    private String weight;

    String getBMI(String name, String height, String weight) {

        this.name = name;
        this.height = height;
        this.weight = weight;

        return String.format("%s 씨는 BMI 결과 정상입니다.", this.name);


    }
}
