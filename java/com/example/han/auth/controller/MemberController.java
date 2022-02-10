package com.example.han.auth.controller;

import com.example.han.auth.domain.BmiDTO;
import com.example.han.auth.domain.CalcDTO;
import com.example.han.auth.domain.GoogleDTO;
import com.example.han.auth.domain.GradeDTO;
import com.example.han.auth.domain.UserDTO;
import com.example.han.auth.service.MemberService;
import com.example.han.auth.service.MemberServiceImpl;

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
        MemberService service = new MemberServiceImpl();

        while (true) {
            String menu = "MENU : 0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String res = "";
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    System.out.println(BmiDTO.BMI_TITLE + "\n이름, 키, 몸무게 입력");
                    BmiDTO bmi = BmiDTO.getInstance();
                    bmi.setName(scanner.next());
                    bmi.setHeight(scanner.nextDouble());
                    bmi.setWeight(scanner.nextDouble());
                    res = service.getBmi(bmi);
                    break;
                case "2" :
                    System.out.println(CalcDTO.CALC_TITLE + "\n숫자1, 연산자, 숫자2 입력");
                    CalcDTO calc = CalcDTO.getInstance();
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.calc(calc);
                    break;
                case "3" :
                    System.out.println(GoogleDTO.GOOGLE_TITLE + "\n[Google 검색 또는 URL 입력]");
                    GoogleDTO google = GoogleDTO.getInstance();
                    google.setSearch(scanner.next());
                    res = service.search(google);
                    break;
                case "4" :
                    System.out.println(GradeDTO.GRADE_TITLE + "\n이름, 국어점수, 영어점수, 수학점수 입력");
                    GradeDTO grade = GradeDTO.getInstance();
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = service.getGrade(grade);
                    break;
                case "5" :
                    System.out.println(UserDTO.LOGIN_TITLE + "\nID, PW, 이름 입력");
                    UserDTO u = UserDTO.getInstance();
                    u.setId(scanner.next());
                    u.setPw(scanner.next());
                    u.setName(scanner.next());
                    res = service.login(u);
                    break;
                default  : res = "1~5만 누르세요";
                    break;
            }
            System.out.println(res);
        }
    }
}
