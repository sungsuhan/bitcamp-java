package com.example.han.service2;

import com.example.han.domain2.BloodTypeDTO;

import java.util.Scanner;

/**
 * packageName: com.example.han.blood
 * fileName        : BloodDemo.java
 * author          : sungsuhan
 * date            : 2022-01-25
 * desc            : 혈액형 앱을 실행하는 컨트롤러
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-01-25         sungsuhan        최초 생성
 **/
public class BloodTypeService {
    public String getBT(BloodTypeDTO bloodType) {

        return String.format("%s 씨는 %d세 %s이며 혈액형은 %s형 입니다", bloodType.getName(), bloodType.getAge(), bloodType.getGender(), bloodType.getBloodtype());
    }
}
