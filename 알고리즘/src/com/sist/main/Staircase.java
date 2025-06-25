package com.sist.main;
/*
 *  동적 계획법 (DP)
예제: 계단 오르기 (1칸 또는 2칸씩 오를 때 경우의 수)

 */
public class Staircase {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1; 
        dp[2] = 2; 

        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + "계단 오르는 방법: " + climbStairs(n));
    }
}
