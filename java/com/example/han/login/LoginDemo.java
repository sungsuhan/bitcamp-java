package com.example.han.login;

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

        String res = loginApp.log(id, pw, name);

        System.out.println(res);








    }
}
