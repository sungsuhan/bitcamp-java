package com.example.han.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.han.quiz.service
 * fileName        : Feb10ServiceImpl.java
 * author          : sungsuhan
 * date            : 2022-02-10
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-10         sungsuhan        최초 생성
 **/
public class Feb10ServiceImpl implements Feb10Service{

    @Override
    public void bubbleSort(Scanner scanner) {

    }

    @Override
    public void insertionSort(Scanner scanner) {

    }

    @Override
    public void selectionSort(Scanner scanner) {

    }

    @Override
    public void quickSort(Scanner scanner) {

    }

    @Override
    public void mergeSort(Scanner scanner) {

    }

    @Override
    public void magicSquare(Scanner scanner) {
        int deg = 0;

        while(true){
            {System.out.print("마방진의 홀수 차수를 입력하세요. : ");
                deg = scanner.nextInt();
                if(deg%2 == 1){}
                else if(deg%2==0){
                    System.out.println("홀수만 입력해야 합니다.");return;}
                else {System.out.println("숫자만 입력해야 합니다.");return;}
            }break;
        }

        int array[][] = new int[deg][deg];
        int a = 1;
        int r = 0;
        int c = deg / 2;

        for(a = 1; a<= (deg*deg); a++){
            array[r][c] = a;
            if (a % deg == 0){
                r++;
            }else{
                r--;
                c--;
                if (r <0)
                    r = deg - 1;
                else if (c <0)
                    c = deg - 1;}
        }


        for(int i=0; i<deg; i++){
            for(int j=0; j<deg; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }

    @Override
    public void zigzag(Scanner scanner) {
        int a = scanner.nextInt();
        int[][] number = new int[a][a];
        ///입력받은 숫자의 형태로 배열을 생성
        int count = 1;
        //배열안에 차례대로 들어갈 숫자

        int j=0;

        for(int i=0; i<=a-1; i++){
            if ((i%2)==0){
                for(j =0; j<=a-1; j++){
                    number[i][j]=count;
                    count++;
                }
            }else{
                for(j =a-1; j>=0; j--){
                    number[i][j]=count;
                    count++;
                }
            }
        }
        for (int k=0; k<=a-1; k++){
            for (int l=0; l<=a-1; l++){
                System.out.print(number[k][l]+"\t");
            }
            System.out.println();
        }
    }

    /**
     * author : sungsuhan
     * des :
     * line 변수 생성 후 입력 스캐너 생성
     * 첫번째 for loop은 0부터 입력값 전까지 돌면서 몇 줄인지를 나타낸다
     * 만약 입력값 line 을 3이라 생각하자
     * 두번째 for loop은 i = 0 -> j=0 자리에 별 총 한개 출력
     *                  i = 1 -> j=0, j=1 자리에 별 총 두개 출력
     *                  i = 2 -> j=0, j=1, j=2 자리에 별 총 세개 출력
     **/
    @Override
    public void rectangleStarPrint(Scanner scanner) {
        int line;
        System.out.println("몇 줄 짜리 직각삼각형?");
        line = scanner.nextInt();
        for (int i=0; i<line; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /**
     * author : sungsuhan
     * des :
     * line 변수 생성 후 입력 스캐너 생성
     * 첫번째 for loop은 0부터 입력값 전까지 돌면서 몇 줄인지를 나타낸다
     * 만약 입력값 line 을 3이라 생각하자
     * 첫번째 for loop 속 첫번째 for loop은 i = 0 -> j=2, j=1 두번 공백 출력
     *                                   i = 1 -> j=2 한번 공백 출력
     *                                   i = 2 -> 공백없음
     * 첫번째 for loop 속 두번째 for loop은 i = 0 -> k=1 별 한번 출력
     *                                   i = 1 -> k=1, k=2, k=3 별 세번 출력
     *                                   i = 2 -> k=1, k=2, k=3, k=4, k=5 별 다섯번 출력
     *
     * 출처 : https://coding-factory.tistory.com/68
     **/
    @Override
    public void triangleStarPrint(Scanner scanner) {
        int line;
        System.out.println("몇 줄 짜리 정삼각형?");
        line = scanner.nextInt();
        for (int i=0; i<line; i++) {
            for (int j=line-1; j>i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i*2+1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
