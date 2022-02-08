package com.example.han.algorithm.service;

/**
 * packageName: com.example.han.algorithm.service
 * fileName        : DFSService.java
 * author          : sungsuhan
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         sungsuhan        최초 생성
 **/
public interface DFSService {
    int getTarget(int[] numbers, int target);
    int network(int n, int[][] computers);
    int english(String begin, String target, String[] words);
    String[] travel(String[][] tickets);
}
