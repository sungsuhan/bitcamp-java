package com.example.han.controller;

import java.util.Scanner;

/**
 * packageName: com.example.han.controller
 * fileName        : DemoController3.java
 * author          : sungsuhan
 * date            : 2022-01-27
 * desc            : 프로그래머스 코딩테스트 컨트롤러
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-27         sungsuhan        최초 생성
 **/
public class DemoControllerProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//각 유형 데모 받을곳

        while (true) {
            System.out.println("[MENU] 0.EXIT \n" +
                    "[김승현] 1.Sort\t" +
                    "2.Binary Search\t" +
                    "3.Brute Force\n" +
                    "[김윤섭] 4.Stack\t" +
                    "5.Queue\t" +
                    "6.DP\n" +
                    "[최민서] 7.Hash\t" +
                    "8.Graph\t" +
                    "9.Greedy\n" +
                    "[한성수] 10.Heap\t" +
                    "11.DFS\t" +
                    "12.BFS"
                    );
            switch (scanner.next()) {
                case "0" :
                    System.out.println("EXIT"); return;
                case "1" :
                    System.out.println("Sort"); break;
                case "2" :
                    System.out.println("BS"); break;
                case "3" :
                    System.out.println("BF"); break;
                case "4" :
                    System.out.println("Stack"); break;
                case "5" :
                    System.out.println("Queue"); break;
                case "6" :
                    System.out.println("DP"); break;
                case "7" :
                    System.out.println("Hash"); break;
                case "8" :
                    System.out.println("Graph"); break;
                case "9" :
                    System.out.println("Greedy"); break;
                case "10" :
                    System.out.println("Heap"); break;
                case "11" :
                    System.out.println("DFS"); break;
                case "12" :
                    System.out.println("BFS"); break;
                default:
                    System.out.println("Wrong Number"); break;
            }
        }
    }
}
