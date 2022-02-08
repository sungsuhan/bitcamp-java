package com.example.han.algorithm.controller;

import com.example.han.algorithm.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.han.algorithm.controller
 * fileName        : AlgoController.java
 * author          : sungsuhan
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         sungsuhan        최초 생성
 **/
public class AlgoController {
    public void execute(Scanner scanner) {
        HeapService heapService = new HeapServiceImpl();
        DFSService dfsService = new DFSServiceImpl();

        while (true) {
            System.out.println("[담당] 0.종료 1.김승현 2.김윤섭 3.최민서 4.한성수");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("종료"); return;
                case "4" :
                    System.out.println("1.Heap 2.DFS 3.BFS");
                    switch (scanner.next()) {
                        case "0" :
                            System.out.println("종료"); return;
                        case "1" :
                            int[] scoville = new int[10];
                            int K = 0;
                            heapService.hot(scoville,K);
                            int[][] jobs = new int[10][10];
                            heapService.disk(jobs);
                            String[] operations = new String[10];
                            heapService.rank(operations);
                            break;
                        case "2" :
                            int[] numbers = new int[10];
                            int target = 0;
                            dfsService.getTarget(numbers,target);
                            int n = 0;
                            int[][] computers = new int[10][10];
                            dfsService.network(n,computers);
                            String begin = "";
                            String strTarget = "";
                            String[] words = new String[10];
                            dfsService.english(begin,strTarget,words);
                            String[][] tickets = new String[10][10];
                            dfsService.travel(tickets);
                            break;
                        case "3" :
                            System.out.println("아직 DFS랑 분류 안함");
                            break;
                    }
                default:
                    System.out.println("잘못된 입력"); break;
            }
        }
    }

}
