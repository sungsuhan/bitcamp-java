package com.example.han.domain2;

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
public class BloodTypeDTO {
    public static String BT_APP = "당신의 혈액형을 알려주세요";
    private String name;
    private String gender;
    private int age;
    private String bloodtype;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBloodtype() {
        return bloodtype;
    }
    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }







//    public String info(String name, String gender, int age, String bloodtype){
//
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.bloodtype = bloodtype;
//
//        return String.format("%s 씨의 혈액형은 %s 입니다", this.name, this.bloodtype);
//    }
}
