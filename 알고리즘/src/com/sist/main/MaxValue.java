package com.sist.main;
// 배열에서 최대값 찾기
public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 3};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("최대값은: " + max);
    }
}

