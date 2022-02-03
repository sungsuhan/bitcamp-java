package com.example.han.controller;

import com.example.han.domain.GradeDTO;
import com.example.han.domain.SubjectDTO;

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
public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] oneNames = {"김승현", "김윤섭", "최민서", "한성수"};
        String[] oneSubjects = {"Sort", "Stack", "Hash", "Heap",
                                "Binary Search", "Queue", "Graph", "DFS",
                                "Brute Force", "DP", "Greedy", "BFS"};


        for (int i=0; i<oneNames.length; i++) {
            System.out.println(oneNames[i] + " : " + oneSubjects[i] + " " + oneSubjects[i+4] + " " + oneSubjects[i+8]);
        }







//        GradeDTO[] grades = new GradeDTO[2];
//
//        for (int i=0; i<grades.length; i++) {
//            grades[i] = new GradeDTO();
//            System.out.println(i+1 + "번째 학생 이름, 국어점수, 영어점수, 수학점수 입력");
//            grades[i].setName(scanner.next());
//            grades[i].setKor(scanner.nextInt());
//            grades[i].setEng(scanner.nextInt());
//            grades[i].setMath(scanner.nextInt());
//        }
//        for (int i=0; i<grades.length; i++) {
//            System.out.println(i+1 + "번째 학생 이름 : "+ grades[i].getName());
//            System.out.println(grades[i].getName() + " 학생 국어점수 : "+ grades[i].getKor());
//            System.out.println(grades[i].getName() + " 학생 영어점수 : "+ grades[i].getEng());
//            System.out.println(grades[i].getName() + " 학생 수학점수 : "+ grades[i].getMath());
//        }

    }
}
