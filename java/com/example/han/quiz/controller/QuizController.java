package com.example.han.quiz.controller;

import java.util.Scanner;

/**
 * packageName: com.example.han.controller
 * fileName        : TempController.java
 * author          : sungsuhan
 * date            : 2022-02-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-03         sungsuhan        최초 생성
 **/
public class QuizController {
    public void execute(Scanner scanner) {
        Feb06Controller feb06Controller = new Feb06Controller();
        Feb07Controller feb07Controller = new Feb07Controller();
        while (true) {
            System.out.println("메뉴 : 0.Exit 1.Feb06 2.Feb07 3.Feb08");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    feb06Controller.execute(scanner);
                    break;
                case "2" :
                    feb07Controller.execute(scanner);
                    break;
                case "3" :
                    System.out.println("Feb08"); break;
            }
        }
    }

}

