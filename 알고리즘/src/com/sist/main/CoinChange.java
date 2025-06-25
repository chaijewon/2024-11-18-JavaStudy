package com.sist.main;
// 그리디 (Greedy Algorithm)
/*
 *   예제: 동전 거스름돈 문제
     가장 큰 단위부터 거슬러 주는 방식
 */
public class CoinChange {
    public static int coinChange(int amount, int[] coins) {
        int count = 0;
        for(int i = coins.length - 1; i >= 0; i--) {
            count += amount / coins[i];
            amount %= coins[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int amount = 1260;
        int[] coins = {1, 10, 50, 100, 500}; // 동전 단위 오름차순
        System.out.println("최소 동전 개수: " + coinChange(amount, coins));
    }
}

