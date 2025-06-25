package com.sist.main;

import java.util.HashMap;
// 배열에서 두 수를 더해서 타겟이 되는 값 찾기
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};  // 없으면 -1, -1 반환
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("인덱스: [" + result[0] + ", " + result[1] + "]");
    }
}
