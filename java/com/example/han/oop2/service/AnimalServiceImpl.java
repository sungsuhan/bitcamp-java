package com.example.han.oop2.service;

import com.example.han.oop2.domain.Animal;
import com.example.han.oop2.domain.Bear;
import com.example.han.oop2.domain.Lion;

/**
 * packageName: com.example.han.oop2.service
 * fileName        : AnimalServiceImpl.java
 * author          : sungsuhan
 * date            : 2022-02-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-09         sungsuhan        최초 생성
 **/
public class AnimalServiceImpl implements AnimalService {
    @Override
    public void myAnimal(Animal animal) {
        System.out.println(animal.toString());
    }

    @Override
    public void myLion(Lion animal) {
        System.out.println(animal.toString());
    }

    @Override
    public void myBear(Bear animal) {
        System.out.println(animal.toString());
    }

}
