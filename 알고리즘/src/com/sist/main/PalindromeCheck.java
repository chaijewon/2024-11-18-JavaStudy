package com.sist.main;
// 문자열이 앞뒤로 같은지 확인하는 문제 : 팰린드롬 문자열 검사

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(str + "는 팰린드롬? " + isPalindrome(str));
    }
}
