package com.example.han.login;
/**
 * packageName: com.example.han.calc
 * fileName        : LoginDemo.java
 * author          : sungsuhan
 * date            : 2022-01-24
 * desc            : 로그인 앱을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         sungsuhan        최초 생성
 */
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();

        System.out.println(LoginApp.LOGIN_APP);

        System.out.println("id : ");
        String id = scanner.next();
        System.out.println("pw : ");
        String pw = scanner.next();
        System.out.println("name : ");
        String name = scanner.next();

        String res = loginApp.getLog(id, pw, name);

        System.out.println(res);




    }
}
