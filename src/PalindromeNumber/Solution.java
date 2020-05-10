package PalindromeNumber;

/**
 * Link of the challenge here : https://leetcode.com/problems/palindrome-number/
 * It was kind of a hard challenge for me.
 * I could just have convert this integer to string and then compare, but I thought that there were no point to
 * do so for me, it's not with this method that I would progress.
 * First, I wanted to check if the first and last digit were equals, and then remove them.
 * This solution worked until I had numbers like "10000021", like if I removed the first digit,
 * which is here 1, I also removed all the 0 that are next to the 1.
 * I decided after to go for the solution provided by Leetcode.
 */
public class Solution {

    public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int res = 0;
        while(x > res){
            int nbToAdd = x%10;
            res = res * 10 + nbToAdd;
            x /= 10;
        }

        return res == x || res/10 == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));
    }
}
