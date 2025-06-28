package Stringss;
import java.util.*;

public class LongestSubstringLength {
    public static int LengthOfLongestSubString(String s){
        Set<Character> charSet = new HashSet<>();

        int left = 0, maxLength = 0;
        for(int right = 0;right<s.length();right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String  s = "abcabcbb";
        System.out.println(LengthOfLongestSubString(s));
    }
}
