package com.example.han.service;

/**
 * packageName: com.example.han.service
 * fileName        : QuizService.java
 * author          : sungsuhan
 * date            : 2022-02-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-07         sungsuhan        최초 생성
 **/
public class QuizServiceImpl implements QuizService{
    @Override
    public void quiz1(String[] arr) {
        System.out.println("Q1.팀별 과제를 출력하세요");
        String s = "";
        for (int i = 0; i< arr.length; i++) {
            if (i%5==0) {
                s += "\n";
            }
            s += i + "." + arr[i] + "\t";
        }
        System.out.println(s);

    }

    @Override
    public void quiz2(String[] arr) {
        System.out.println("Q2.팀장이 맡은 과제를 출력하세요"); //예) 김윤섭 : Stack, Queue, DP
        String s = "";
        for (int i = 0; i< arr.length; i++) {
            if (arr[i].equals("김윤섭")) {
                for (int j=0; j<4; j++) {
                    s += arr[i + j*5] + "\t";
                }
                if (i==17) {break;}
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz3(String[] arr) {
        System.out.println("Q3.선택한 과목의 사람을 출력하세요"); //예) 큐를 담당한 사람 : 김윤섭
        String s = "";
        for (int i = 0; i< arr.length; i++) {
            if (arr[i].equals("Queue")) {
                s += arr[i%5];
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz4(String[] arr) {
        System.out.println("Q4.팀원별 과제 수를 출력하세요"); //예) 김승현(3개) 김윤섭(3개) 최민서(2개) 한성수(2개) 김태욱(2개)
        int count = 0;
        String countManager = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i].equals(arr[5])) {
                count0++;
            }
            if (arr[i].equals(arr[6])) {
                count1++;
            }
            if (arr[i].equals(arr[7])) {
                count2++;
            }
            if (arr[i].equals(arr[8])) {
                count3++;
            }
            if (arr[i].equals(arr[9])) {
                count4++;
            }
        }
        System.out.println(arr[0] + "의 카운트는 " + count0);
        System.out.println(arr[1] + "의 카운트는 " + count1);
        System.out.println(arr[2] + "의 카운트는 " + count2);
        System.out.println(arr[3] + "의 카운트는 " + count3);
        System.out.println(arr[4] + "의 카운트는 " + count4);
    }
}
