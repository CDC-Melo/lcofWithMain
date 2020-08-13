public class SumNums
{
    public int sumNums(int n)
    {
        boolean flag = n > 1 && (n += sumNums(n-1)) > 0;
        return n;
    }

    public static void main(String[] args)
    {
        System.out.println(new SumNums().sumNums(100));
    }
}
