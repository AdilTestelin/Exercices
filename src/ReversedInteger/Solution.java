package ReversedInteger;

/**
 * Link of the challenge here : https://leetcode.com/problems/reverse-integer/submissions/
 * Here, it's important to remember how to pop a number (with modulo and division) AND
 * mainly how to check if the solution will overflow in a way or another,
 * with the two condition here.
 */
public class Solution {

    public static int reverse(int x) {
        int res = 0;
        while(x!=0){
            int nbToAdd = x%10;
            x /= 10;
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && nbToAdd > 7))
                return 0;
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && nbToAdd < -8))
                return 0;
            res = (res * 10) + (nbToAdd);
        }
        return res;
    }

    public static void main(String[] args) {
         System.out.println(reverse(-123));
    }
}
