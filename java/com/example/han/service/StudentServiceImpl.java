package com.example.han.service;

import com.example.han.domain.*;

/**
 * packageName: com.example.han.service
 * fileName        : StudentServiceImpl.java
 * author          : sungsuhan
 * date            : 2022-02-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-07         sungsuhan        최초 생성
 **/
public class StudentServiceImpl implements StudentService{
    @Override
    public String getBmi(BmiDTO bmi) {
        return String.format("%s 씨는 BMI 결과 정상입니다.", bmi.getName());

    }

    @Override
    public String calc(CalcDTO calc) {
        int res = 0;

        switch (calc.getOpcode()) {
            case "+":
                res = calc.getNum1() + calc.getNum2();
                break;
            case "-":
                res = calc.getNum1() - calc.getNum2();
                break;
            case "*":
                res = calc.getNum1() * calc.getNum2();
                break;
            case "/":
                res = calc.getNum1() / calc.getNum2();
                break;
        }
        return String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2(), res);
    }

    @Override
    public String search(GoogleDTO search) {
        return String.format("검색결과 : %s", search.getSearch());
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";

        return String.format("########## %s ###########\n" +
                " 이름: %s\n" +
                "> 국어: %d점 \n" +
                "> 영어: %d점 \n" +
                "> 수학: %d점\n" +
                " 총점: %d점 \n" +
                " 평균(정수): %d점\n" +
                " 합격여부: %s\n" +
                "############################", GradeDTO.GRADE_TITLE, grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(), total, avg, pass);
    }

    @Override
    public String login(LoginDTO login) {
        return (login.getPw().equals(login.getPASSWORD())) ? String.format("%s 님의 비번 %s 가 맞습니다, 로그인 성공", login.getName(), login.getPw())
                : String.format("%s 님의 ID는 맞고 비번 %s 가 틀립니다, 로그인 실패", login.getName(), login.getPw());

    }
}
