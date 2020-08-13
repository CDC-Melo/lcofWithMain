public class MinArray
{
    public int minArray(int[] nums)
    {
        int i = 0;
        int j = nums.length - 1;
        while(i < j)
        {
            int m = (i+j)/2;
            if(nums[m] < nums[j]) j = m;
            else if(nums[m] > nums[j]) i = m+1;
            else j--;
        }
        return nums[i];
    }

    public static void main(String[] args)
    {
        int[] nums = new int[]{3,4,5,1,2};
        System.out.println(new MinArray().minArray(nums));
    }
}
