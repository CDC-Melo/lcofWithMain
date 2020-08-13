public class BuildTree
{
    public TreeNode rebuildTree(int[] preorder,int[] inorder)
    {
        return new BuildTree().letUsBuildOurTree(
                preorder,0,preorder.length,inorder,0,inorder.length);
    }

    private TreeNode letUsBuildOurTree(int[] preorder,int p_start,int p_end,int[] inorder,int i_start,int i_end)
    {
        if(p_start == p_end)
            return null;
        int root_value = preorder[p_start];
        TreeNode root = new TreeNode(root_value);
        int root_index = -1;
        for(int i = i_start;i < i_end;i++)
        {
            if(inorder[i] == root_value)
            {
                root_index = i;
                break;
            }
        }

        int leftNum = root_index - i_start;
        root.left = letUsBuildOurTree(preorder,p_start+1,p_start+leftNum+1,inorder,
                i_start,root_index);
        root.right = letUsBuildOurTree(preorder,p_start+leftNum+1,p_end,inorder,
                root_index+1,i_end);
        return root;

    }

    public void printTree(TreeNode root)
    {
        if(root == null) return;
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args)
    {
        int[] pre = new int[]{3,9,20,15,7};
        int[] in = new int[]{9,3,15,20,7};
        TreeNode root = new BuildTree().rebuildTree(pre,in);
        new BuildTree().printTree(root);
    }
}

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int num){val = num;}
}
