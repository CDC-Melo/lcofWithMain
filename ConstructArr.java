public class ConstructArr
{
    public int[] constructArr(int[] a)
    {
        if(a.length == 0) return new int[0];
        int[] b = new int[a.length];
        int temp = 1;
        b[0] = 1;
        for(int i = 1;i < a.length;i++)
        {
            b[i] = b[i-1] * a[i-1];
        }
        for(int i = a.length - 2;i >= 0;i--)
        {
            temp *= a[i+1];
            b[i] *= temp;
        }
        return b;
    }

    public static void main(String[] args)
    {
        int[] nums = new int[]{1,2,3,4,5};
        int[] res = new ConstructArr().constructArr(nums);
        for(int num : res) System.out.println(num);
    }
}
