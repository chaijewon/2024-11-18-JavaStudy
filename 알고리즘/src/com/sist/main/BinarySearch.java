package com.sist.main;
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // 찾지 못함
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("타겟 " + target + "은(는) 인덱스 " + index + "에 있습니다.");
        } else {
            System.out.println("타겟을 찾을 수 없습니다.");
        }
    }
}
