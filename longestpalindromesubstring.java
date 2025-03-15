public class longestpalindromesubstring {
    public static String LongestPalindrome(String s){
        if (s.length() <= 1) {
            return s;
        }
        String LPS = "";
        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd-length palindromes
            int low = i, high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                String palindrome = s.substring(low, high + 1);
                if (palindrome.length() > LPS.length()) {
                    LPS = palindrome;
                }
                low--;
                high++;
            }

            // Case 2: Even-length palindromes
            low = i;
            high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                String palindrome = s.substring(low, high + 1);
                if (palindrome.length() > LPS.length()) {
                    LPS = palindrome;
                }
                low--;
                high++;
            }
        }
        return LPS;
    }
    public static void main(String args[]){
        String str = "cbbd";
        System.out.print(LongestPalindrome(str));
    }
}
