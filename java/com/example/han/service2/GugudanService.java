package com.example.han.service2;

import com.example.han.domain2.GugudanDTO;

/**
 * packageName: com.example.han.service2
 * fileName        : GugudanService.java
 * author          : sungsuhan
 * date            : 2022-02-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-01         sungsuhan        최초 생성
 **/
public class GugudanService {
    public String execute(GugudanDTO gugudan) {

        int res = 0;

        res = gugudan.getDan() * gugudan.getSu();

        return String.format("%d X %d = %d", gugudan.getDan(), gugudan.getSu(), res);
    }
}
