package com.example.han.oop2.domain;

/**
 * packageName: com.example.han.oop2.domain
 * fileName        : Bear.java
 * author          : sungsuhan
 * date            : 2022-02-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-09         sungsuhan        최초 생성
 **/
public class Bear extends Lion{
    public final static String NAME = "곰";
    private String swim;

    public Bear(String swim) {
        super("4");
        this.swim = swim;
    }

    public String getSwim() {
        return swim;
    }

    public void setSwim(String swim) {
        this.swim = swim;
    }

    @Override
    public String toString() {
        return String.format("%s인 %s는 %s인 다리로 빠르게 %s이고 %s을 해서 %s을 먹는다",super.getKind(),NAME,super.getLegs(),super.getMove(),swim,super.getEat());
    }
}
