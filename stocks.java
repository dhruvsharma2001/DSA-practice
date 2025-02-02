public class stocks {
    public static int buyandsellpricestocksSingleTransaction(int prices[])
    {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<prices.length;i++){
            
            if(buyprice<prices[i]){
                int profit= prices[i]-buyprice;
                maxprofit= Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
}
 return maxprofit;
    }
    public static void main(String args[]){
    int prices[] = {100 ,180 ,260 ,310 ,40 ,535 ,695};
    System.out.println(buyandsellpricestocksSingleTransaction(prices));
    }
    }

