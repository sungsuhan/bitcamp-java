package com.example.han.service;

import com.example.han.domain.GoogleDTO;

/**
 * packageName: com.example.han.google
 * fileName        : GoogleDemo.java
 * author          : sungsuhan
 * date            : 2022-01-25
 * desc            : 구글앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 **/
public class GoogleService {
    public String execute(GoogleDTO search) {

        return String.format("검색결과 : %s", search.getSearch());

    }
}
