public class tilingproblem {
    public static int TilingProblem(int n) { // 2*n
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical
        int vertical = TilingProblem(n - 1);
        // horizontal
        int horizontal = TilingProblem(n - 2);
        int totways = vertical + horizontal;
        return totways;

    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(TilingProblem(n));
    }
}
