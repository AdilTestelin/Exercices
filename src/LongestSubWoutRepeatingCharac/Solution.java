package LongestSubWoutRepeatingCharac;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int cpt = 1;
        int cptFinal = 1;
        for (int i = 0; i < s.length(); i++) {
            String tab =  "";
            tab += s.charAt(i);
            for (int j = i; j < s.length(); j++) {
                char nextString = s.charAt(j+1);
                if (s.charAt(i) == s.charAt(i + 1) && !tab.contains(nextString)) {
                    cpt++;
                } else {
                    cptFinal = cpt;
                }
                cpt = 1;
            }
        } return cptFinal;
    }
}
