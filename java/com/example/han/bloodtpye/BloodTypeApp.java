package com.example.han.bloodtpye;

/**
 * packageName: com.example.han.blood
 * fileName        : BloodApp.java
 * author          : sungsuhan
 * date            : 2022-01-25
 * desc            : 혈액형을 입력하는 앱
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-25         sungsuhan        최초 생성
 **/
public class BloodTypeApp {
    public static String BT_APP = "당신의 혈액형을 알려주세요";
    private String name;
    private String gender;
    private int age;
    private String bloodtype;

    public String info(String name, String gender, int age, String bloodtype){

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.bloodtype = bloodtype;

        return String.format("%s 씨의 혈액형은 %s 입니다", this.name, this.bloodtype);


    }
}
