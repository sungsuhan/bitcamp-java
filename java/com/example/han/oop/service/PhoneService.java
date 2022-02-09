package com.example.han.oop.service;

import com.example.han.oop.domain.CelPhone;
import com.example.han.oop.domain.GalPhone;
import com.example.han.oop.domain.IPhone;
import com.example.han.oop.domain.Phone;

import java.util.Scanner;

/**
 * packageName: com.example.han.service
 * fileName        : PhoneService.java
 * author          : sungsuhan
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         sungsuhan        최초 생성
 **/
public interface PhoneService {
    void usePhone(Phone phone);
    void useCelPhone(CelPhone phone);
    void useIPhone(IPhone phone);
    void useGalPhone(GalPhone phone);
}
