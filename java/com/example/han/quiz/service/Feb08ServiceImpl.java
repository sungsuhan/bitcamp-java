package com.example.han.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.han.quiz.service
 * fileName        : Feb08ServiceImpl.java
 * author          : sungsuhan
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         sungsuhan        최초 생성
 **/
public class Feb08ServiceImpl implements Feb08Service {

    @Override
    public void lotto(Scanner scanner) {
        /** 1) 서로 다른 6개의 정수를 저장할 배열을 선언한다
         * 2) 1~45 사이의 임의의 정수를 만든다.
         * 3) 얻은 정수가 배열에 포함된 수인지 확인하고 포함되지 않은 정수만 배열에 저장한다
         * 4) 같은 방법으로 서로 다른 6개의 수가 배열에 저장될 때까지 반복한다.
         * 로또 i번째 칸이랑 i보다 작은 칸들의 인덱스랑 다 비교해서 그 인덱스들이 서로 같지 않을 때까지 반복한다.
         * 인덱스가 같은게 나오면 i 반복수를 줄이고, 해당 검열 반복문을 종료한다.
         */
        int lotto[] = new int[6];
        System.out.println("로또 번호 : ");
        for(int i = 0; i< lotto.length; i++) {
            int num = (int) (Math.random() * 45) + 1;
            lotto[i] = num;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                }
            }
        }
        for(int i = 0; i< lotto.length; i++) {
            System.out.println(lotto[i]);
        }

    }

    @Override
    public void baseball(Scanner scanner) {

        int random = (int) (Math.random()*9) +1;
        int answer[] = new int[3];
        int input[] = new int[3];

        for (int i=0; i<answer.length; i++) {
            answer[i] = random;
        }

        int strike = 0;
        int ball = 0;
        int out = 0;
        String userNum;

        while (true) {
            System.out.println("세 자리 숫자 입력");
                userNum = scanner.nextLine();
                if (userNum.length() != 3) {
                    System.out.println("재입력");
                }else {
                    break;
                }
        }

        for (int i=0 ; i<input.length; i++) {
            input[i] = userNum.charAt(i)-48;
        }

        for (int i=0; i<input.length; i++) {
            for (int j=0; j<input.length; j++) {
                if (answer[i] == input[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }

        if (strike==0 && ball==0) {
            out++;
        }

        System.out.println(strike + " 스트라이크");
        System.out.println(ball + " 볼");
        System.out.println(out + " 아웃");

        if (strike == 3) {
            System.out.println("승리");
        }





    }

    @Override
    public void booking(Scanner scanner) {
        String [][] seat = new String[7][7];
        String [] list = {"A","B","C","D","E","F","G"};
        for(int i =0; i<7;i++){
            for (int j=0; j<7;j++){
                seat[i][j] = " □ ";}}
        while (true){
            System.out.println("\n원하시는 메뉴번호를 입력 해주세요.\n0.Exit 1.예약조회 2.예약신청 3.예약취소");
            int select = scanner.nextInt();
            switch (select){
                case 0:
                    System.out.println("종료");return;
                case 1 : {for (int i = 0; i < 7; i++) {
                    System.out.print("\n" + list[i] + " ");
                    for (int j = 0; j < 7; j++) {
                        System.out.print(seat[i][j]);}}}break;
                case 2:
                    System.out.println("행번호를을 입력해주세요. A(1) ~ G(7) ");
                    int row = scanner.nextInt() - 1;
                    while (row > 6){
                        System.out.println("존재하지 않는 행입니다.");return;
                    }
                    System.out.println("열번호를 입력해주세요. 1 ~ 7");
                    int col = scanner.nextInt() - 1;
                    while (col > 6){
                        System.out.println("존재하지 않는 열입니다.");return;
                    }
                    seat[row][col] = " ■ ";
                    System.out.println("예약 신청되었습니다.");
                    break;
                case 3:
                    System.out.println("행번호를을 입력해주세요. A(1) ~ G(7)");
                    int row2 = scanner.nextInt() - 1;
                    while (row2 > 6){
                        System.out.println("존재하지 않는 행입니다.");return;
                    }
                    System.out.println("열번호를 입력해주세요. 1 ~ 7");
                    int col2 = scanner.nextInt() - 1;
                    while (col2 > 6){
                        System.out.println("존재하지 않는 열입니다.");return;
                    }
                    seat[row2][col2] = " □ ";
                    System.out.println("예약이 취소되었습니다.");
                    break;
                default:System.out.println("존재하지 않는 메뉴번호 입니다.");break;
            }
        }

    }

    /**
     * author : sungsuhan
     * des :
     * money 디폴트 값으로 생성
     * name, pw 차례대로 입력스캐너 생성
     * while 무한 loop 생성
     * 입력값 input 입력스캐너 생성
     * switch 조건문에서 input이 0 이면 종료 출력후 return 때문에 완전 밖으로 나온다
     * input이 1이면 입금 출력 후 money 입력스캐너 생성
     * money += scanner.nextInt(); == money = money + scanner.nextInt();
     * break; 때문에 다시 메뉴로 올라감
     * input이 2이면 출금 출력 후 money 입력스캐너 생성
     * money -= scanner.nextInt(); == money = money - scanner.nextInt();
     * break; 때문에 다시 메뉴로 올라감
     * input이 3이면 앞에 출력했던 name 과 money를 불러온 후 출력
     * break; 때문에 다시 메뉴로 올라감
     * 입력값이 0,1,2,3 모두 아니면 0~3입력 출력 후 다시 메뉴로 올라감
     *
     * 출처 : https://dw-forensic.tistory.com/entry/2%ED%9A%8C%EC%B0%A8-%EC%9E%90%EB%B0%94%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D%EC%9C%BC%EB%A1%9C-%EC%9D%80%ED%96%89%EC%9E%85%EC%B6%9C%EA%B8%88%EB%A7%8C%EB%93%A4%EA%B8%B0
     **/
    @Override
    public void bank(Scanner scanner) {
        int money = 0;
        System.out.println("이름 입력");
        String name = scanner.next();
        System.out.println("계좌 비밀번호 입력");
        int pw = scanner.nextInt();
        System.out.println("계좌 인증 완료");
        while (true) {
            System.out.println("0.종료 1.입금 2.출금 3.잔고");
            int input = scanner.nextInt();
            switch (input) {
                case 0 :
                    System.out.println("종료"); return;
                case 1 :
                    System.out.println("입금 : ");
                    money += scanner.nextInt();
                    break;
                case 2 :
                    System.out.println("출금 :");
                    money -= scanner.nextInt();
                    break;
                case 3 :
                    System.out.println(name + "님의 잔고 : " + money + "원");
                    break;
                default:
                    System.out.println("0~3 입력"); break;
            }
        }

    }
    /**
     * author : 최민서
     * des : 각 단이 세로로 출력 되어야 하므로 2*1 2*2 2*3 순서가 아닌
     *        2*1 3*1 4*1 5*1 순서로 출력이 되도록 생각하고 코드 짜기
     */
    @Override
    public void gugudan(Scanner scanner) {
        for (int i = 2; i < 10; i += 4){ //구구단은 2단부터 시작.
            for (int j = 1; j < 10; j++){ // 1 ~ 9 까지 곱이 나오도록 조건 잡기
                for (int k = i; k < i+4; k++){
                    System.out.print(k + "*" + j + "="+(k * j)+"\t");
                }
                System.out.print("\n"); // 4개씩 출력 되어야 하므로 j*i 값 4개를 출력 후 엔터
            }
            System.out.println("\n"); //4개의 단(2단~5단)이 모두 출력 된 후, 엔터
        }
    }
}
