package com.example.han.phone.service;

import com.example.han.phone.service.PhoneService;

import java.util.Scanner;

/**
 * packageName: com.example.han.service
 * fileName        : PhoneServiceImpl.java
 * author          : sungsuhan
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         sungsuhan        최초 생성
 **/
public class PhoneServiceImpl implements PhoneService {
    @Override
    public void phone(Scanner scanner) {
        System.out.println("집번호 : 02-3473-2890");
    }

    @Override
    public void celphone(Scanner scanner) {
        System.out.println("핸드폰번호 : 010-3375-2890");
    }

    @Override
    public void iphone(Scanner scanner) {
        System.out.println("아이폰 유저");
    }

    @Override
    public void galphone(Scanner scanner) {
        System.out.println("갤럭시노트 유저");
    }
}
