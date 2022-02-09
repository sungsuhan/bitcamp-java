package com.example.han.oop.domain;

/**
 * packageName: com.example.han.oop.domain
 * fileName        : Phone.java
 * author          : sungsuhan
 * date            : 2022-02-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-09         sungsuhan        최초 생성
 **/
public class Phone {
    protected String kind;
    protected String company;
    protected String call;

    public Phone(String kind, String company){
        this.kind = kind;
        this.company = company;
    }

    public String getKind() {
        return kind;
    }

    public String getCompany() {
        return company;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return String.format("%s에서 만든 %s 를 이용하여 %s 라고 통화를 한다",company,kind, call);
    }
}
