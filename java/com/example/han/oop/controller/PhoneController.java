package com.example.han.oop.controller;

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
public class PhoneController {
    public void execute(Scanner scanner) {
        PhoneService service = new PhoneServiceImpl();

        while (true) {
            System.out.println("메뉴 : 0.종료 1.Phone 2.CelPhone 3.IPhone 4.GalPhone");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("종료"); return;
                case "1" :
                    service.phone(scanner); break;
                case "2" :
                    service.celphone(scanner); break;
                case "3" :
                    service.iphone(scanner); break;
                case "4" :
                    service.galphone(scanner); break;
                default:
                    System.out.println("1~4 입력"); break;
            }
        }


















    }
}
