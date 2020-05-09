package LongestSubWoutRepeatingCharac;

import java.util.*;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int cptFinal = 1;
        for(int i = 0; i < s.length(); i++) {
            ArrayList<Character> listChara = new ArrayList<>();
            int cpt = 1;
            listChara.add(s.charAt(i));
            boolean loop = true;
            int j = i+1;
            while(loop && j < s.length()-1){
                Character chara = s.charAt(j);
                if(!listChara.contains(chara)){
                    cpt++;
                    listChara.add(chara);
                } else {
                    cptFinal = cpt;
                    loop = false;
                }
            }
        }

        return cptFinal;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
