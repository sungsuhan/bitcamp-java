package com.example.han.auth.service;

import com.example.han.auth.domain.*;

/**
 * packageName: com.example.han.service
 * fileName        : StudentService.java
 * author          : sungsuhan
 * date            : 2022-02-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-07         sungsuhan        최초 생성
 **/
public interface MemberService {
    String getBmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String search(GoogleDTO search);
    String getGrade(GradeDTO grade);
    String login(UserDTO login);
}
