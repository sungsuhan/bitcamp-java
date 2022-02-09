package com.example.han.oop.repository;

/**
 * packageName: com.example.han.oop.repository
 * fileName        : CellPhone.java
 * author          : sungsuhan
 * date            : 2022-02-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-09         sungsuhan        최초 생성
 **/
public class CellPhone {
    String model;
    String color;

    void powerOn() {System.out.println("ON");}
    void powerOff() {System.out.println("OFF");}
    void bell() {System.out.println("RING RING");}
    void sendVoice(String mesaage) {System.out.println("나: " + mesaage);}
    void receiveVoice(String message) {System.out.println("상대: " + message);}
    void hangUp() {System.out.println("전화 종료");}
}
