public class FriendspairProblem {
    public static int Pairing(int n){
        if(n==1||n==2){
            return n;
        }
        //for single
        int singleWays = Pairing(n-1);
        //for pair
        int multipleWays = (n-1)*Pairing(n-2);
        int totalWays = singleWays + multipleWays;
        return totalWays;
    }
    public static void main(String args[]){
        int n= 4;
        System.out.print(Pairing(n));
    }
}
