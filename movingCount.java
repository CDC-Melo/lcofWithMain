public class movingCount
{
    int m,n,k;
    int res;
    boolean[][] marked;
    public int movingCount(int m,int n,int k)
    {
        marked = new boolean[m][n];
        this.k = k;
        this.m = m;
        this.n = n;
        res = 0;
        dfs(0,0);
        return res;
    }

    private void dfs(int i,int j)
    {
        if(!isArea(i,j)) return;
        if(marked[i][j]) return;
        if(isOk(i,j))
        {
            res++;
            dfs(i+1,j);
            dfs(i,j+1);
        }
        marked[i][j] = true;
    }

    private boolean isArea(int newX,int newY)
    {
        if(newX < 0 || newX >= m || newY < 0 || newY >= n) return false;
        return true;
    }

    private boolean isOk(int newX,int newY)
    {
        return newX%10 + newX/10 + newY%10 + newY/10 <= k;
    }

    public static void main(String[] args)
    {
        int m = 2;
        int n = 3;
        int k = 1;
        System.out.println(new movingCount().movingCount(m,n,k));
    }
}
