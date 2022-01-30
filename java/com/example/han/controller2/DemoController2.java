package com.example.han.controller2;

import com.example.han.domain2.BloodTypeDTO;
import com.example.han.domain2.KakaoDTO;
import com.example.han.domain2.NaverDTO;
import com.example.han.service2.BloodTypeService;
import com.example.han.service2.KakaoService;
import com.example.han.service2.NaverService;

import java.util.Scanner;

/**
 * packageName: com.example.han.controller2
 * fileName        : DemoController2.java
 * author          : sungsuhan
 * date            : 2022-01-29
 * desc            : 복습용 컨트롤러
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-29         sungsuhan        최초 생성
 **/
public class DemoController2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BloodTypeDTO bloodType = new BloodTypeDTO();
        BloodTypeService bloodTypeService = new BloodTypeService();
        KakaoDTO kakao = new KakaoDTO();
        KakaoService kakaoService = new KakaoService();
        NaverDTO naver = new NaverDTO();
        NaverService naverService = new NaverService();

        while (true) {
            System.out.println("[메뉴]\n" + "0.종료 1.혈액형앱 2.카카오앱 3.네이버앱");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("종료"); return;
                case "1" :
                    System.out.println(BloodTypeDTO.BT_APP + "\n이름 입력");
                    bloodType.setName(scanner.next());
                    System.out.println("성별 입력");
                    bloodType.setGender(scanner.next());
                    System.out.println("나이 입력");
                    bloodType.setAge(scanner.nextInt());
                    System.out.println("혈액형 입력");
                    bloodType.setBloodtype(scanner.next());
                    System.out.println(bloodTypeService.getBT(bloodType));
                    break;
                case "2" :
                    System.out.println("카카오앱"); break;
                case "3" :
                    System.out.println("네이버앱"); break;
                default :
                    System.out.println("1~3 입력"); break;
            }
        }
    }
}
