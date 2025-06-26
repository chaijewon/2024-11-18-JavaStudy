package com.sist.main;
/*
 *   이진 탐색 (Binary Search) - 중급
•	  설명: 정렬된 배열에서만 사용 가능. 중간값을 기준으로 범위를 절반씩 좁힘
•	  시간 복잡도: O(log n)
•	  조건: 배열이 오름차순 or 내림차순으로 정렬되어 있어야 함

 */
public class BinarySearch_1 {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11}; // 정렬된 배열
        int target = 7;
        int index = binarySearch(nums, target);
        System.out.println("이진 탐색 결과: " + index);
    }
}

