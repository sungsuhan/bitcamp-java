package com.example.han.oop2.domain;

/**
 * packageName: com.example.han.oop2.domain
 * fileName        : Animal.java
 * author          : sungsuhan
 * date            : 2022-02-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-09         sungsuhan        최초 생성
 **/
public class Animal {
    protected String move;
    protected String eat;
    protected String drink;
    protected String kind;

    public Animal(String kind, String move) {
        this.kind = kind;
        this.move = move;
    }

    public String getMove() {
        return move;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return String.format("%s는 %s이고 %s을 마시며 %s를 먹는다",kind,move,drink,eat);

    }
}
