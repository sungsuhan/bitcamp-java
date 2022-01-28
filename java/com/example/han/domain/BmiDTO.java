package com.example.han.domain;

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
public class BmiDTO {
    public static String BMI_TITLE = "무조건 정상인 BMI 측정기";
    private String name;
    private String height;
    private String weight;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }


}
