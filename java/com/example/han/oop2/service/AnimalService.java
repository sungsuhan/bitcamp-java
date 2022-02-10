package com.example.han.oop2.service;

import com.example.han.oop2.domain.Animal;
import com.example.han.oop2.domain.Bear;
import com.example.han.oop2.domain.Lion;

import java.util.Scanner;

/**
 * packageName: com.example.han.oop2.service
 * fileName        : AnimalService.java
 * author          : sungsuhan
 * date            : 2022-02-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-09         sungsuhan        최초 생성
 **/
public interface AnimalService {
    void myAnimal(Animal animal);
    void myLion(Lion animal);
    void myBear(Bear animal);
}
