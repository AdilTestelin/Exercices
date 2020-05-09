package LongestSubWoutRepeatingCharac;

import java.util.*;

/**
 * Challenge available here : https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
 * It was kind of a bruteforce approach here.
 * Maybe using a hashset could have been better and more simple.
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){ // Testing if the length of the string is 0.
            return 0;
        }

        int cptFinal = 1;
        for(int i = 0; i < s.length(); i++) {
            ArrayList<Character> listChara = new ArrayList<>(); // Our list of character already read.
            int cpt = 1; // Our counter variable.
            listChara.add(s.charAt(i)); // We put i-th character into the array.
            boolean loop = true; // Our variable for stoping the while loop.
            int j = i+1; // The index of our next character.
            while(loop && j < s.length()){
                Character chara = s.charAt(j);
                if(!listChara.contains(chara)){ // We test if our character is in the array, if so :
                    cpt++; // We increasing our counter.
                    listChara.add(chara); // We add the character in our array.
                    j++; // We move on to the next character on the list.

                    if(j == s.length() && cpt > cptFinal){ // If we are at the end of the string.
                        cptFinal = cpt;
                    }
                } else { // Otherwise, the character is in our array.
                    if(cpt > cptFinal){ // We're affecting our temporary counter to the final counter.
                        cptFinal = cpt;
                    }
                    loop = false; // We leave the loop.
                }
            }
        }
        return cptFinal;
    }

    /**
     * Main program to test if we're okay with the leetcode current testcase.
     */
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
    }
}
