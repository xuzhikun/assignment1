/**
 * Created by xuzhi on 10/28/2016.
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            max = diff > 0 ? max + diff : max;
        }
        return max;
    }
}
