package com.example.han.oop2.controller;

import com.example.han.oop2.domain.Animal;
import com.example.han.oop2.domain.Bear;
import com.example.han.oop2.domain.Lion;
import com.example.han.oop2.service.AnimalService;
import com.example.han.oop2.service.AnimalServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.han.oop2.controller
 * fileName        : OOPController.java
 * author          : sungsuhan
 * date            : 2022-02-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-09         sungsuhan        최초 생성
 **/
public class OOP2Controller {
    public void execute(Scanner scanner) {

        while (true) {
            AnimalService animalService = new AnimalServiceImpl();
            System.out.println("메뉴 : 0.종료 1.동물 2.사자 3.곰");
            switch (scanner.next()) {
                case "0" :
                    System.out.println("종료"); return;
                case "1" :
                    Animal animal = new Animal("포유류","움직");
                    animal.setDrink("물");
                    animal.setEat("음식");
                    animalService.myAnimal(animal);
                    break;
                case "2" :
                    Lion lion = new Lion("4");
                    lion.setKill("사람");
                    animalService.myLion(lion);
                    break;
                case "3" :
                    Bear bear = new Bear("수영");
                    animalService.myBear(bear);
                    break;
                default:
                    System.out.println("1~3입력"); break;
            }
        }
    }
}
