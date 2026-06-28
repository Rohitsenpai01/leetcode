class MaxProfit121 {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE, maxprice = 0;
        for (int x : prices) {
            minprice = Math.min(x, minprice);
            maxprice = Math.max(maxprice, x - minprice);
        }
        return maxprice;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        MaxProfit solver = new MaxProfit();
        int profit = solver.maxProfit(prices);
        System.out.println("Max profit: " + profit);
    }
}