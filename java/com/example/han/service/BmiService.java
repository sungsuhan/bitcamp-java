package com.example.han.service;

import com.example.han.domain.BmiDTO;

/**
 * packageName: com.example.han.bmi
 * fileName        : BmiDemo.java
 * author          : sungsuhan
 * date            : 2022-01-25
 * desc            : bmi 앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 **/
public class BmiService {
    public String bmi(BmiDTO bmi) {

        return String.format("%s 씨는 BMI 결과 정상입니다.", bmi.getName());

    }
}
