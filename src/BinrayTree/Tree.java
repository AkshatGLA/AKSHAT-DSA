package BinrayTree;

public class Tree {
    public class TreeNode{
        TreeNode left;
        TreeNode right;
        TreeNode(TreeNode left, TreeNode right){
            this.left=left;
            this.right=right;
        }
    }
    public static int height(TreeNode root){
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        TreeNode root = tree.new TreeNode(null, null);
        TreeNode leftChild = tree.new TreeNode(null, null);
        TreeNode rightChild = tree.new TreeNode(null, null);
        


    }
}
