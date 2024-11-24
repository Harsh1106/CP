class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
class SameTree{
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static void printTree(TreeNode root) {
        if (root == null) return;
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(6);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.right = new TreeNode(6);

        System.out.println("First Tree:");
        printTree(root1);
        System.out.println();

        System.out.println("Second Tree:");
        printTree(root2);
        System.out.println();

        System.out.println("Are the two trees the same ? " + isSameTree(root1, root2));
    }
}