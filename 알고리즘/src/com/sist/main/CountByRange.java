package com.sist.main;
// 정렬된 배열에서 특정 값 개수 세기 (이진 탐색 응용)

public class CountByRange {
    // 특정 값 이상인 인덱스 찾기
    static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while(left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] >= target) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    // 특정 값 초과인 인덱스 찾기
    static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while(left < right) {
            int mid = (left + right) / 2;
            if(arr[mid] > target) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static int countByRange(int[] arr, int leftValue, int rightValue) {
        return upperBound(arr, rightValue) - lowerBound(arr, leftValue);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int left = 2, right = 3;
        System.out.println(left + "부터 " + right + "까지 개수: " + countByRange(arr, left, right));
    }
}

