public class FrogJump
{
    public int numWays(int n)
    {
        int a = 1;
        int b = 1;
        int sum = 0;
        for(int i = 0;i < n;i++)
        {
            sum = (a+b)%1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args)
    {
        System.out.println(new FrogJump().numWays(7));
    }
}
