package com.example.han.member.controller;

import com.example.han.member.domain.BmiDTO;
import com.example.han.member.domain.CalcDTO;
import com.example.han.member.domain.GoogleDTO;
import com.example.han.member.domain.GradeDTO;
import com.example.han.member.domain.LoginDTO;
import com.example.han.member.service.MemberService;
import com.example.han.member.service.MemberServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.han.controller
 * fileName        : DemoController.java
 * author          : sungsuhan
 * date            : 2022-01-27
 * desc            : 생성한 데모들의 종합 컨트롤러
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-27         sungsuhan        최초 생성
 **/
public class MemberController {
    public void execute(Scanner scanner) {
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();
        MemberService service = new MemberServiceImpl();
    /*
        for (int i=0; i<2; i++) {
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
            switch (select) {
                case "1" : res = "BMI"; break;
                case "2" : res = "CALC"; break;
                case "3" : res = "SEARCH"; break;
                case "4" : res = "GRADE"; break;
                case "5" : res = "LOGIN"; break;
                default  : res = "1~5만 누르세요"; break;
            }
            System.out.println(res);
        }
    */
        while (true) {
            String menu = "MENU : 0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String res = "";
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    System.out.println(BmiDTO.BMI_TITLE + "\n이름, 키, 몸무게 입력");
                    bmi.setName(scanner.next());
                    bmi.setHeight(scanner.nextDouble());
                    bmi.setWeight(scanner.nextDouble());
                    res = service.getBmi(bmi);
                    break;
                case "2" :
                    System.out.println(CalcDTO.CALC_TITLE + "\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.calc(calc);
                    break;
                case "3" :
                    System.out.println(GoogleDTO.GOOGLE_TITLE + "\n[Google 검색 또는 URL 입력]");
                    google.setSearch(scanner.next());
                    res = service.search(google);
                    break;
                case "4" :
                    System.out.println(GradeDTO.GRADE_TITLE + "\n이름, 국어점수, 영어점수, 수학점수 입력");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = service.getGrade(grade);
                    break;
                case "5" :
                    System.out.println(LoginDTO.LOGIN_TITLE + "\nID, PW, 이름 입력");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = service.login(login);
                    break;
                default  : res = "1~5만 누르세요";
                    break;
            }
            System.out.println(res);
        }
    }
}
