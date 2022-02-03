package com.example.han.domain;

/**
 * packageName: com.example.han.domain
 * fileName        : SubjectDTO.java
 * author          : sungsuhan
 * date            : 2022-02-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-03         sungsuhan        최초 생성
 **/
public class SubjectDTO {

    public static String SUBJECT_TITLE = "1조 프로그래머스 코딩테스트";
    private String name;
    private String subject;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }



}
