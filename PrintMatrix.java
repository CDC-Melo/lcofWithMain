public class PrintMatrix
{
    public int[] spiralOrder(int[][] matrix)
    {
        if(matrix.length == 0) return new int[0];

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int index = 0;
        int[] res = new int[(right+1) * (bottom+1)];

        while(true)
        {
            for(int i = left;i <= right;i++) res[index++] = matrix[top][i];
            if(++top > bottom) break;
            for(int i = top;i <= bottom;i++) res[index++] = matrix[i][right];
            if(--right < left) break;
            for(int i = right;i >= left;i--) res[index++] = matrix[bottom][i];
            if(--bottom < top) break;
            for(int i = bottom;i >= top;i--) res[index++] = matrix[i][left];
            if(++left > right) break;
        }

        return res;
    }

    public static void main(String[] args)
    {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[] res = new PrintMatrix().spiralOrder(matrix);
        for (int re : res) System.out.print(re + " ");
    }
}
