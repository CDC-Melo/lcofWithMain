public class MaxSubArray
{
    public int maxSub(int[] nums)
    {
        if(nums == null || nums.length == 0) return 0;
        int max = nums[0];
        int curSum = 0;
        for(int num : nums)
        {
            if(curSum > 0)
                curSum += num;
            else
                curSum = num;
            max = Math.max(max,curSum);
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new MaxSubArray().maxSub(nums));
    }
}
