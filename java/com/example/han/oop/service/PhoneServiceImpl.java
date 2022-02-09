package com.example.han.oop.service;

import com.example.han.oop.domain.CelPhone;
import com.example.han.oop.domain.GalPhone;
import com.example.han.oop.domain.IPhone;
import com.example.han.oop.domain.Phone;

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
        Phone phone = new Phone();
        phone.call();
    }

    @Override
    public void celphone(Scanner scanner) {
        CelPhone phone = new CelPhone();
        phone.call();
        phone.wireless();
    }

    @Override
    public void iphone(Scanner scanner) {
        IPhone phone = new IPhone();
        phone.call();
        phone.wireless();
        phone.internet();
    }

    @Override
    public void galphone(Scanner scanner) {
        GalPhone phone = new GalPhone();
        phone.call();
        phone.wireless();
        phone.internet();
        phone.pay();
    }
}
