package LongestSubWoutRepeatingCharac;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int cpt = 1;
        int cptFinal = 1;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                cpt++;
            } else {
                cptFinal = cpt;
                cpt = 1;
            }
        } return cptFinal;
    } 
}
