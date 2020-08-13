public class MissingNumber
{
    public int missingNumber(int[] nums)
    {
        int i = 0;
        int j = nums.length - 1;
        while(i <= j)
        {
            int m = (i+j)/2;
            if(nums[m] == m)
                i=m+1;
            else
                j=m-1;
        }
        return i;
    }

    public static void main(String[] args)
    {
        int[] nums = new int[]{0,1,2,3,4,5,6,7,9};
        System.out.println(new MissingNumber().missingNumber(nums));
    }
}
