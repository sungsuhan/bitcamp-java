package com.example.han.service;

import com.example.han.domain.GradeDTO;

/**
 * packageName: com.example.han.grade
 * fileName        : GradeDemo.java
 * author          : sungsuhan
 * date            : 2022-01-26
 * desc            : grade앱 실행하는 컨트롤러
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-26         sungsuhan        최초 생성
 **/
public class GradeService {
    public String grade(GradeDTO grade) {

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
}
