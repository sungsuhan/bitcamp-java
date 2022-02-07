package com.example.han.controller;

import java.util.Scanner;

/**
 * packageName: com.example.han.controller
 * fileName        : ArrayExam.java
 * author          : sungsuhan
 * date            : 2022-02-04
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-04         sungsuhan        최초 생성
 **/
public class ArrayExam {
    public static void main(String[] args) {

        String[] arr = {"권혜민", "조현국",    "김진영",  "김한슬",  "서성민",
                        "정렬",   "해시",       "힙",   "완전탐색",   "DP",
                        "스택", "깊이우선탐색 ", "그래프", "탐욕법",  "이중탐색",
                        "큐",  "너비우선탐색"};



        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        String s = "";
        for (int i=0; i<arr.length; i++) {
            if (i%5==0) {
                s += "\n";
            }
        }


//        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 권혜민, 정렬, 스택, 큐");


//        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 ");




//        System.out.println("Q4.팀원별 과제 수를 출력하세요 예)권혜민(3개) 조현국(3개) 김진영(2개) 김한슬(2개) 서성민(2개)");

        


    }
}
