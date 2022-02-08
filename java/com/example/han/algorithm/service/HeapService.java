package com.example.han.algorithm.service;

/**
 * packageName: com.example.han.algorithm.service
 * fileName        : HeapService.java
 * author          : sungsuhan
 * date            : 2022-02-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-02-08         sungsuhan        최초 생성
 **/
public interface HeapService {
    int hot(int[] scoville, int K);
    int disk(int[][] jobs);
    int[] rank(String[] operations);
}
