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
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useCelPhone(CelPhone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useIPhone(IPhone phone) {
        System.out.println(phone.toString());
    }

    @Override
    public void useGalPhone(GalPhone phone) {
        System.out.println(phone.toString());
    }
}
