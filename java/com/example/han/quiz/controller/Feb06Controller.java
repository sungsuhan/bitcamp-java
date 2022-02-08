package com.example.han.quiz.controller;

import com.example.han.quiz.service.Feb06Service;
import com.example.han.quiz.service.Feb06ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.han.quiz.controller
 * fileName        : Feb06Controller.java
 * author          : sungsuhan
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         sungsuhan        최초 생성
 **/
public class Feb06Controller {
    public void execute(Scanner scanner) {
        Feb06Service service = new Feb06ServiceImpl();

        String[] arr = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                "Sort", "Stack", "Hash", "Heap", "Greedy",
                "Binary Search", "Queue", "Graph", "DFS", "BFS",
                "Brute Force", "DP"};

        while (true) {
            System.out.println("메뉴 : 0.종료 1.팀별 과제 출력 2.팀장이 맡은 과제 출력 3.선택한 과목의 사람 출력 4.팀원별 과제 수 출력");
            switch (scanner.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    service.quiz1(arr);
                    break;
                case "2":
                    service.quiz2(arr);
                    break;
                case "3":
                    service.quiz3(arr);
                    break;
                case "4":
                    service.quiz4(arr);
                    break;
                default:
                    System.out.println("1~4 입력");
                    break;
            }
        }
    }
}
