package com.example.han.bmi;

import java.util.Scanner;

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
public class BmiDemo {
    public String execute(String name, String height, String weight) {
        BmiApp bmiApp = new BmiApp();

        return bmiApp.info(name, height, weight);

    }
}
