import java.util.PriorityQueue;

public class GetLeastNumbers
{
    public int[] getLeastNumbers(int[] nums,int k)
    {
        if(nums.length == 0 || k == 0) return new int[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(k,(o1,o2) -> Integer.compare(o2,o1));
        for(int num : nums)
        {
            if(pq.size() < k || num < pq.peek())
                pq.add(num);
            if(pq.size() > k)
                pq.poll();
        }
        int[] res = new int[k];
        int j = 0;
        for(int e : pq)
            res[j++] = e;
        return res;
    }

    public static void main(String[] args)
    {
        int[] nums = new int[]{4,5,1,6,2,7,3,8};
        int[] res = new GetLeastNumbers().getLeastNumbers(nums,4);
        for(int num : res) System.out.println(num);
    }
}
