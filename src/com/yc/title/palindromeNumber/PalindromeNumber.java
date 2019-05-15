package com.yc.title.palindromeNumber;

/**判断是否是回文数
 * https://leetcode-cn.com/problems/palindrome-number/
 * Created by yc on 2019/5/15.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int z = x;
        long y = 0;
        while(x!=0){
            int pop = x%10;
            x = x/10;

            y = y * 10 + pop;

        }
        return z == y;

    }

    public static void main(String[] args) {

    }
}
