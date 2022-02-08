package com.example.han.quiz.service;

import com.example.han.quiz.service.Feb07Service;

import java.util.Scanner;

/**
 * packageName: com.example.han.service
 * fileName        : Feb07ServiceImpl.java
 * author          : sungsuhan
 * date            : 2022-02-07
 * desc            :
 * // (int)Math.random()*최댓값 +최솟값  => 최대최소 사이 랜덤수
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-07         sungsuhan        최초 생성
 **/
public class Feb07ServiceImpl implements Feb07Service {
    @Override
    public void dice(Scanner scanner) {

        String s = "";
        int num = (int) (Math.random()*6 +1);
        switch (num) {
            case 1:
                s = "1";
                break;
            case 2:
                s = "2";
                break;
            case 3:
                s = "3";
                break;
            case 4:
                s = "4";
                break;
            case 5:
                s = "5";
                break;
            case 6:
                s = "6";
                break;
        }
        System.out.println(s);
    }



    @Override
    public void prime(Scanner scanner) {
        System.out.println("두 수를 입력하시오.");
        System.out.println("num 1");
        int num1 = scanner.nextInt();
        System.out.println("num 2");
        int num2 = scanner.nextInt();
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(i + " ");
            }
            count = 0;
        }
    }


    @Override
    public void leap(Scanner scanner) {
        int year = scanner.nextInt();
        String res = "";

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            res = year + "년은 윤년";
        } else {
            res = year + "년은 평년";
        }
        System.out.println(res);
    }


    @Override
    public void updown(Scanner scanner) {
        int answer = (int) (Math.random()*100 +1);
        int input;

        while (true) {
            System.out.println("1~100 사이 자연수 입력");
            input = scanner.nextInt();
            if (answer > input) {
                System.out.println("Up");
            } else if (answer < input) {
                System.out.println("Down");
            } else {
                System.out.println("정답");
                break;
            }
        }
    }


}