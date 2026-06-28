class MaxProfit122 {
    public int maxProfit(int[] prices) {
         int profit =0;
        for (int i = 0 ; i < prices.length-1; i++) {
            int temp = prices[i+1] - prices[i];
            profit += temp > 0? temp: 0;
        }
        return profit;
    }
     public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        MaxProfit122 solver = new MaxProfit122();
        int result = solver.maxProfit(prices);
        System.out.println("Max profit: " + result);
    }
}