// Define a basic binary tree node class
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class sortedArrayToBinaryTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return aToB(nums, 0, nums.length - 1);
    }

    public static TreeNode aToB(int[] nums, int st, int end){
        if(st > end)
            return null;
        int mid = (st + end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = aToB(nums, st, mid - 1);
        root.right = aToB(nums, mid + 1, end);
        return root;
    }

    // Helper method to print the binary tree
    public static void printTree(TreeNode node, String indent) {
        if (node == null) return;
        System.out.println(indent + node.val);
        printTree(node.left, indent + "  ");
        printTree(node.right, indent + "  ");
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, 0, 5, 9};
        TreeNode root = new sortedArrayToBinaryTree().sortedArrayToBST(arr);
        printTree(root, "");
    }
}