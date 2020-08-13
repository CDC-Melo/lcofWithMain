public class Exchange
{
    public int[] exchange(int[] nums)
    {
        int i = 0;
        int j = nums.length - 1;
        int temp;
        while(i < j)
        {
            while(i < j && (nums[i] & 1) == 1) i++;
            while(i < j && (nums[j] & 1) == 0) j--;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    public static void main(String[] args)
    {
        int[] nums = new int[]{1,2,3,4};
        new Exchange().exchange(nums);
        for(int num : nums) System.out.print(num + " ");
    }
}
