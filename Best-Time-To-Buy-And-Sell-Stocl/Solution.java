import java.util.*;
public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.size(); i++) {
            minPrice = Math.min(minPrice, prices.get(i));
            profit = Math.max(profit, prices.get(i) - minPrice);
        }
        return profit;
    }
}