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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();

        System.out.println(BmiApp.BMI);

        System.out.println("이름");
        String name = scanner.next();

        System.out.println("성별");
        String gender = scanner.next();

        System.out.println("키");
        String height = scanner.next();

        System.out.println("몸무게");
        String weight = scanner.next();

        String res = bmiApp.info(name, gender, height, weight);

        System.out.println(res);

    }
}
