public class ExistWord
{
    public boolean exist(char[][] board,String word)
    {
        char[] words = word.toCharArray();
        for(int i = 0;i < board.length;i++)
        {
            for(int j = 0;j < board[0].length;j++)
            {
                if(dfs(board,i,j,words,0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board,int i,int j,char[] word,int index)
    {
        if(i < 0 || i >= board.length || j < 0 || j > board[0].length || board[i][j] != word[index])
            return false;
        if(index == word.length - 1)
            return true;
        char c = board[i][j];
        board[i][j] = '?';
        boolean res = dfs(board,i+1,j,word,index+1) || dfs(board,i,j+1,word,index+1)
                || dfs(board,i-1,j,word,index+1) || dfs(board,i,j-1,word,index+1);
        board[i][j] = c;
        return res;
    }

    public static void main(String[] args)
    {
        char[][] board = new char[][]{{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        String word = new String("abcced");
        System.out.println(new ExistWord().exist(board,word));
    }
}
