package BinrayTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Implementation {
    static int size=0;
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }

    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" -> ");
        if(root.left!=null)  System.out.print(root.left.val+",");
//        else System.out.print("n");
        if (root.right!=null) System.out.print(root.right.val);
//        else System.out.print("n");
        System.out.println();
        display(root.left);
        display(root.right);
// this function will print in pre order traversal
    }

    public static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE ;
        int a=root.val;
        int b=max(root.left);
        int c=max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int height(Node root){
//        if(root==null) return 0;
//        if(root.left==null && root.right==null) return 0;
//        return 1+ Math.max(height(root.left) , height(root.right));
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a=root.val;
        int b=min(root.left);
        int c=min(root.right);
        return Math.min(a,Math.min(b,c));
    }

    public static int product(Node root){
        if(root==null) return 1;
        int a=root.val;
        int b=product(root.left);
        int c=product(root.right);
        return a*b*c;
    }
    //    Preorder traversal
    public static void preorder(Node root){
//        preorder is root left right
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root){
//        inorder is left root right
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
//        inorder is left right root
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+ " ");
    }
    public static void nthLevel(Node root, int x){
        if(root==null) return;
        if(x==1) System.out.print(root.val+" ");
        nthLevel(root.left,x-1);
        nthLevel(root.right, x-1);

    }
    public static void nthLevel2(Node root, int x){
        if(root==null) return;
        if(x==1) System.out.print(root.val+" ");
        nthLevel(root.right, x-1);
        nthLevel(root.left,x-1);

    }
    public static void bfs(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp=q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    public static int diameter(Node root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        int leftTree=diameter(root.left);
        int rightTree=diameter(root.right);
        int mid=height(root.left) + height(root.right);
        if(root.left!=null) mid++;
        if(root.right!=null) mid++;

        return Math.max(mid, Math.max(leftTree, rightTree));
    }

    public static boolean isBalanced(Node root) {
        if(root==null) return true;
        int leftTree=height(root.left);
        int rightTree=height(root.right);
        if(root.left!=null) leftTree++;
        if(root.right!=null) rightTree++;

        int dif=Math.abs(leftTree-rightTree);
        if(dif>1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }

    public static boolean isSameTree(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val)return false;
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
    public static void helper(Node root, List<String> ans, String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s+=root.val;
            ans.add(s);
            return;
        }
        helper(root.left, ans, s+root.val+"->");
        helper(root.right, ans, s+root.val+"->");
    }
    public static List<String> binaryTreePaths(Node root) {
        List<String> ans=new ArrayList<>();
        helper(root, ans,"");
        return ans;
    }
    public static boolean contains(Node root, Node node){
        if(root==null) return false;
        if(root==node) return true;
        return (contains(root.left, node) ||contains(root.right,node));
    }
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(p==root || q==root) return root;
        if(p==q) return p;
        boolean leftp=contains(root.left,p);
        boolean rightq=contains(root.right,q);
        if((leftp && rightq) || (!leftp && !rightq)) return root;
        if(leftp && !rightq) return lowestCommonAncestor(root.left,p,q);
        if(!leftp && rightq) return lowestCommonAncestor(root.right,p,q);
        return null;
    }
    public static Node invertTree(Node root) {
        if(root==null) return root;
        Node left=root.left;
        Node right=root.right;
        root.left=invertTree(right);
        root.right=invertTree(left);
        return root;
    }
    public static boolean isSameTree2(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val)return false;
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
    public static Node invertTree2(Node root) {
        if(root==null) return root;
        Node left=root.left;
        Node right=root.right;
        root.left=invertTree2(right);
        root.right=invertTree2(left);
        return root;
    }
    public static boolean isSymmetric(Node root) {
        if(root==null) return true;
        root.left=invertTree2(root.left);
        return isSameTree2(root.left,root.right);

    }

    public static void nthLevel_1(Node root, int x, List<Integer> arr){
        if (root == null) return;
        if (x == 1) arr.add(root.val);
        nthLevel_1(root.left, x-1, arr);
        nthLevel_1(root.right, x-1, arr);
    }

    public static void nthLevel_2(Node root, int x, List<Integer> arr){
        if (root == null) return;
        if (x == 1) arr.add(root.val);
        nthLevel_2(root.right, x-1, arr);
        nthLevel_2(root.left, x-1, arr);
    }

    public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        int level = height(root);

        for (int i = 1; i <= level; i++) {
            List<Integer> arr = new ArrayList<>();
            if (i % 2 != 0)
                nthLevel_1(root, i, arr);  // left to right
            else
                nthLevel_2(root, i, arr); // right to left
            ans.add(arr);  // <-- **Don't forget to add the array!**
        }

        return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        Node f=new Node(7);
        b.left=e;
        b.right=f;

        System.out.println(diameter(root));
        System.out.println(isBalanced(root));
//        bfs(root);
//        System.out.println(height(root));

//        int level=height(root)+1;
//        for(int i=1;i<=level;i++){
//            nthLevel(root,i);
//            System.out.println();
//        }

//        System.out.println("======= Preorder =========");
//        preorder(root);
//        System.out.println();
//        System.out.println("======== Inorder =========");
//        inorder(root);
//        System.out.println();
//        System.out.println("======== Postorder ========");
//        postorder(root);
//        display(root);
//        preorder(root);
//        System.out.println(size(root));
//        System.out.println(sum(root));
//        System.out.println(max(root));
//        System.out.println(height(root));
//        System.out.println(min(root));
//        System.out.println(product(root));
    }
}
