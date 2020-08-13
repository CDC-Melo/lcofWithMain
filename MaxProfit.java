public class MaxProfit
{
    public int maxProfit(int[] prices)
    {
        int cost = Integer.MAX_VALUE;
        int profit = 0;
        for(int price : prices)
        {
            cost = Math.min(price,cost);
            profit = Math.max(price-cost,profit);
        }
        return profit;
    }

    public static void main(String[] args)
    {
        int[] nums = new int[]{7,1,5,3,6,4};
        System.out.println(new MaxProfit().maxProfit(nums));
    }
}
