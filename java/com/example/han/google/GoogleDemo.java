package com.example.han.google;

import java.util.Scanner;

/**
 * packageName: com.example.han.google
 * fileName        : GoogleDemo.java
 * author          : sungsuhan
 * date            : 2022-01-25
 * desc            : 구글앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 **/
public class GoogleDemo {
    public String execute(String search) {
        GoogleApp googleApp = new GoogleApp();

        return googleApp.google(search);

    }
}
