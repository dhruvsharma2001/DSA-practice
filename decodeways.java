public class decodeways {
    public static int DeocdeWays(String s){
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0'?0:1;

        for(int i=2;i<=n;i++){
            int oneDigit = Integer.valueOf(s.substring(i-1, i));
            int twoDigit = Integer.valueOf(s.substring(i - 2, i));

            if(oneDigit>=1){
                dp[i] += dp[i-1];
            }
            if(twoDigit>=10 && twoDigit<=26){
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        String s = "122016";
        System.out.println(DeocdeWays(s));
    }
}
