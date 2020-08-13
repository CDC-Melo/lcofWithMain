public class IsSubStructure
{
    public boolean isSubStructure(TreeNode A, TreeNode B)
    {
        return (A != null && B != null) && (recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B));
    }

    private boolean recur(TreeNode p, TreeNode q)
    {
        if(q == null) return true;
        if(p == null || q.val != p.val) return false;
        return recur(p.left,q.left) && recur(p.right,q.right);
    }

    public static void main(String[] args)
    {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(2);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(1);
        node6.left = node7;
        System.out.println(new IsSubStructure().isSubStructure(node1,node6));

    }
}

/*class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){val = x;}
}*/
