public class PrintNto {
    public static void main(String[] args) {
        int n = 000;
        System.out.println(countNumberOfZeroes(n));
    }

    public static int countNumberOfZeroes(int n){
        return helperforCounting(n, 0);
    }

    private static int helperforCounting(int n, int count){
        if (n == 0) {
            return count;
        }

        if (n % 10 == 0) {
            return helperforCounting(n/10, count+1);
        }
        return helperforCounting(n / 10, count);
    }
    public static int addDigits(int num){
        if (num == 0) {
            return 0;
        }

        return num % 10 + addDigits(num / 10);

    }
    //for printing triangle
    public static void printTriangle(int row, int column){
        if(row == 0){
            return;
        }
        if(column< row){
            printTriangle(row, column+1);
            System.out.print("*");
        }else{
            printTriangle(row-1, 0);
            System.out.println();
        }
    }
}
