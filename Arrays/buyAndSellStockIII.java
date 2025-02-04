public class buyAndSellStockIII {
    public static int MaximizeProfit(int prices[]){
        if (prices == null || prices.length == 0) return 0;

        int firstBuy = Integer.MIN_VALUE, firstSell = 0;
        int secondBuy = Integer.MIN_VALUE, secondSell = 0;

        for (int price : prices) {
            firstBuy = Math.max(firstBuy, -price);
            firstSell = Math.max(firstSell, firstBuy + price); 
            secondBuy = Math.max(secondBuy, firstSell - price); 
            secondSell = Math.max(secondSell, secondBuy + price); 
        }
        return secondSell;
    }
    public static void main(String[] args) {
        int prices[] = {3,3,5,0,0,3,1,4};
        System.out.println(MaximizeProfit(prices));
    }
}
