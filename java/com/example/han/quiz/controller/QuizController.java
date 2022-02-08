package com.example.han.quiz.controller;

import com.example.han.quiz.service.*;

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
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();

        while (true) {
            System.out.println("Sub Menu : 0.Exit 1.Feb06 2.Feb07 3.Feb08");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    String[] arr = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                            "Sort", "Stack", "Hash", "Heap", "Greedy",
                            "Binary Search", "Queue", "Graph", "DFS", "BFS",
                            "Brute Force", "DP"};
                    System.out.println("서브 메뉴 : 0.종료 1.팀별 과제 출력 2.팀장이 맡은 과제 출력 3.선택한 과목의 사람 출력 4.팀원별 과제 수 출력");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("종료");
                            return;
                        case "1":
                            feb06Service.quiz1(arr);
                            break;
                        case "2":
                            feb06Service.quiz2(arr);
                            break;
                        case "3":
                            feb06Service.quiz3(arr);
                            break;
                        case "4":
                            feb06Service.quiz4(arr);
                            break;
                        default:
                            System.out.println("1~4 입력");
                            break;
                    }
                    break;
                case "2" :
                    System.out.println("서브 메뉴 : 0.종료 1.주사위 2.가위바위보 3.소수 구하기 4.윤년,평년 5.업 & 다운");
                    switch (scanner.next()) {
                        case "0" :
                            System.out.println("종료"); return;
                        case "1" :
                            System.out.println("주사위");
                            feb07Service.dice(scanner);
                            break;
                        case "2" :
                            System.out.println("가위바위보");
                            break;
                        case "3" :
                            System.out.println("소수구하기");
                            feb07Service.prime(scanner);
                            break;
                        case "4" :
                            System.out.println("연도를 입력하시오");
                            feb07Service.leap(scanner);
                            break;
                        case "5" :
                            System.out.println("Up & Down 게임");
                            feb07Service.updown(scanner);
                            break;
                        default:
                            System.out.println("1~5 사이 입력"); break;
                    }
                    break;
                case "3" :
                    System.out.println("서브 메뉴 : 0.종료 1.로또 2.야구 3.좌석예약 4.은행 입출금 5.구구단");
                    switch (scanner.next()) {
                        case "0" :
                            System.out.println("종료"); return;
                        case "1" :
                            System.out.println("로또");
                            feb08Service.lotto(scanner);
                            break;
                        case "2" :
                            System.out.println("야구");
                            feb08Service.baseball(scanner);
                            break;
                        case "3" :
                            System.out.println("좌석예약");
                            feb08Service.booking(scanner);
                            break;
                        case "4" :
                            System.out.println("은행 입출금");
                            feb08Service.bank(scanner);
                            break;
                        case "5" :
                            System.out.println("구구단");
                            feb08Service.gugudan(scanner);
                            break;
                        default:
                            System.out.println("1~5 사이 입력"); break;
                    }
                    break;
            }
        }
    }

}

