package com.example.han.oop.repository;

/**
 * packageName: com.example.han.oop.repository
 * fileName        : Test.java
 * author          : sungsuhan
 * date            : 2022-02-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-09         sungsuhan        최초 생성
 **/
public class Test {
    public static void main(String[] args) {

        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        System.out.println("모델: " + dmbCellPhone.model);
        System.out.println("색상: " + dmbCellPhone.color);

        System.out.println("채널: " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("나 길동이야");
        dmbCellPhone.sendVoice("오 안녕");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();

        Student student = new Student("한성수", "1876055662", 7);
        System.out.println("name : " + student.name);
        System.out.println("ssn : " + student.ssn);
        System.out.println("StudentNo : " + student.studentNo);


    }
}
