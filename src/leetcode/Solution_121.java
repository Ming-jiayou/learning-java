package src.leetcode;
public class Solution_121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int minPrice = Integer.MAX_VALUE; // 用于记录当前的最小买入价格
        int maxProfit = 0; // 用于记录当前的最大利润
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // 更新最小买入价格
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // 更新最大利润
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution_121 solution = new Solution_121();
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit(prices1)); // 输出: 5
        
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(solution.maxProfit(prices2)); // 输出: 0
    }
}
