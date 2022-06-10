package Arrays;

public class BestTimeToSellBuyStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];

        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);

            int profit = prices[i] - minSoFar;

            maxProfit = Math.max(maxProfit, profit);

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToSellBuyStock obj = new BestTimeToSellBuyStock();
        int[] prices = new int[]{1, 26, 45, 3, 1, 9, 0};
        System.out.println(obj.maxProfit(prices));
    }
}
