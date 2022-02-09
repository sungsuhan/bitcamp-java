package com.example.han.oop.controller;

import com.example.han.oop.domain.CelPhone;
import com.example.han.oop.domain.GalPhone;
import com.example.han.oop.domain.IPhone;
import com.example.han.oop.domain.Phone;
import com.example.han.oop.service.PhoneService;
import com.example.han.oop.service.PhoneServiceImpl;


import java.util.Scanner;

/**
 * packageName: com.example.han.controller
 * fileName        : PhoneController.java
 * author          : sungsuhan
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         sungsuhan        최초 생성
 **/
public class OOPController {
    public void execute(Scanner scanner) {

        while (true) {
            System.out.println("메뉴 : 0.종료 1.은닉화(Encapsulation) 2.상속(Inheritance) 3.추상화(Abstraction) 4.다형성(Polymorphism");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("종료"); return;
                case "1" :
                    System.out.println("POJO가 은닉화다"); break;
                case "2" :
                    System.out.println("extends가 상속이다");
                    Phone phone = new Phone("금성전화기", "금성전자");
                    CelPhone celphone = new CelPhone("블랙베리", "옛날 핸드폰", "이동중에");
                    IPhone iphone = new IPhone("애플");
                    GalPhone galphone = new GalPhone("삼성");
                    PhoneService phoneService = new PhoneServiceImpl();
                    System.out.println("소메뉴 : 0.종료 1.집전화 2.핸드폰 3.아이폰 4.갤럭시");
                    switch (scanner.next()) {
                        case "0" :
                            System.out.println("종료"); return;
                        case "1" :
                            phone.setCall("여보세요?");
                            phoneService.usePhone(phone);
                            break;
                        case "2" :
                            celphone.setCall("안녕하세요");
                            phoneService.useCelPhone(celphone);
                            break;
                        case "3" :
                            iphone.setSearch("뉴스");
                            phoneService.useIPhone(iphone);
                            break;
                        case "4" :
                            galphone.setPay("삼성 페이");
                            phoneService.useGalPhone(galphone);
                            break;
                    }
                    break;
                case "3" :
                    System.out.println("추상화"); break;
                case "4" :
                    System.out.println("다형성"); break;
                default:
                    System.out.println("1~4 입력"); break;
            }
        }


















    }
}
