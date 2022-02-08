package com.example.han.quiz.controller;

import com.example.han.quiz.service.Feb07Service;
import com.example.han.quiz.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.han.controller
 * fileName        : Feb07Controller.java
 * author          : sungsuhan
 * date            : 2022-02-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-07         sungsuhan        최초 생성
 **/
public class Feb07Controller {
    public void execute(Scanner scanner) {
        Feb07Service service = new Feb07ServiceImpl();

        while (true) {
            System.out.println("메뉴 : 0.종료 1.주사위 2.가위바위보 3.소수 구하기 4.윤년,평년 5.업 & 다운");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("종료"); return;
                case "1" :
                    System.out.println("주사위");
                    service.dice(scanner);
                    break;
                case "2" :
                    System.out.println("가위바위보");
                    break;
                case "3" :
                    System.out.println("소수구하기");
                    service.prime(scanner);
                    break;
                case "4" :
                    System.out.println("연도를 입력하시오");
                    service.leap(scanner);
                    break;
                case "5" :
                    System.out.println("Up & Down 게임");
                    service.updown(scanner);
                    break;
                default:
                    System.out.println("1~5 사이 입력"); break;
            }
        }










    }
}
