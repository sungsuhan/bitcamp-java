package com.example.han.bloodtpye;

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
public class BloodTypeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BloodTypeApp bloodTypeApp = new BloodTypeApp();

        System.out.println(BloodTypeApp.BT_APP);

        System.out.println("당신의 이름은 무엇입니까?");
        String name = scanner.next();

        System.out.println("당신의 성별은 무엇입니까?");
        String gender = scanner.next();

        System.out.println("당신의 몇살입니까?");
        int age = scanner.nextInt();

        System.out.println("당신의 혈액형은 무엇입니까?");
        String bloodtype = scanner.next();

        String res = bloodTypeApp.info(name, gender, age, bloodtype);

        System.out.println(res);












    }
}
