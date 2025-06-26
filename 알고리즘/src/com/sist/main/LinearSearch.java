package com.sist.main;
/*
 *   선형 탐색 (Linear Search) - 초급
•	  설명: 배열을 처음부터 끝까지 하나씩 비교해서 원하는 값을 찾음
•	  시간 복잡도: O(n)
•	  특징: 정렬되어 있지 않아도 가능

 */
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1; // 못 찾았을 경우
    }

    public static void main(String[] args) {
        int[] nums = {4, 7, 2, 9, 1};
        int target = 9;
        int index = linearSearch(nums, target);
        System.out.println("결과: " + index);
    }
}

