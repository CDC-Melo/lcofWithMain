public class GiftMaxValue
{
    public int maxValue(int[][] grid)
    {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0;i < row;i++)
        {
            for(int j = 0;j < col;j++)
            {
                if(i == 0 && j == 0) continue;
                else if(i == 0) grid[i][j] += grid[i][j-1];
                else if(j == 0) grid[i][j] += grid[i-1][j];
                else grid[i][j] = Math.max(grid[i-1][j],grid[i][j-1]) + grid[i][j];
            }
        }
        return grid[row-1][col-1];
    }

    public static void main(String[] args)
    {
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(new GiftMaxValue().maxValue(grid));
    }
}
