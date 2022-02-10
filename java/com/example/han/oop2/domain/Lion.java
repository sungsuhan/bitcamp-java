package com.example.han.oop2.domain;

/**
 * packageName: com.example.han.oop2.domain
 * fileName        : Lion.java
 * author          : sungsuhan
 * date            : 2022-02-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-09         sungsuhan        최초 생성
 **/
public class Lion extends Animal{
    public final static String NAME = "사자";
    protected String kill;
    protected String legs;

    public Lion(String legs) {
        super("포유류", "움직");
        this.legs = legs;

    }

    public String getKill() {
        return kill;
    }

    public void setKill(String kill) {
        this.kill = kill;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return String.format("%s인 %s는 빠르게 %s여 %s을 죽일 수 있고 다리가 %s개다",super.getKind(),NAME,super.getMove(),kill,legs);
    }
}
