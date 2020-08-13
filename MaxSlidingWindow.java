import java.util.LinkedList;
import java.util.Queue;

public class MaxSlidingWindow
{
    public int[] maxSlidingWindow(int[] nums, int k)
    {
        if(nums == null || k < 1 || nums.length < k) return new int[0];

        LinkedList<Integer> queue = new LinkedList<>();
        int index = 0;
        int[] res = new int[nums.length - k + 1];
        for(int i = 0;i < nums.length;i++)
        {
            while(!queue.isEmpty() && nums[queue.peekLast()] <= nums[i])
                queue.pollLast();

            queue.addLast(i);
            if(queue.peekFirst() == i - k)
                queue.pollFirst();

            if(i >= k-1)
                res[index++] = nums[queue.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int[] res = new MaxSlidingWindow().maxSlidingWindow(nums,3);
        for(int num : res) System.out.println(num);
    }
}
