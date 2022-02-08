package com.example.han.quiz.service;

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
public class Feb06ServiceImpl implements Feb06Service {
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

        String s = "";
        int[] intArr = new int[5];
        int[] resArr = new int[5];

        for (int i=5; i<arr.length; i++) {
            int a = i%5;
            for (int j=0; j<5; j++) {
                if (a==j) {
                    intArr[j]++;
                }
                resArr = intArr;
            }
        }
        for(int i = 0; i< 5; i++){
            System.out.println(arr[i]+"("+resArr[i]+"개)");
        }



    }
}
