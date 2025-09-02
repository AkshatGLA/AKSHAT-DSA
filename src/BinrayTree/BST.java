//import java.util.*;
//
//public class BST{
//
//	public static class Node{
//		int val;
//		Node left;
//		Node right;
//		public Node(int val){
//			this.val=val;
//		}
//	}
//
//	public static int height(Node root)
//	{
//		if(root==null) return 0;
//		return 1 + Math.max(height(root.left),height(root.right));
//	}
//
//	public static void nthLevel(Node root, int n)
//	{
//		if(root==null) return;
//		if(n==1){
//			System.out.print(root.val+" ");
//			return;
//		}
//		nthLevel(root.left,n-1);
//		nthLevel(root.right,n-1);
//	}
//
//	public static Node constructbfs(String []arr)
//	{
//		int x=Integer.parseInt(arr[0]);
//		int n=arr.length;
//
//		Node root=new Node(x);
//
//		Queue<Node> q=new LinkedList<>();
//		q.add(root);
//		int i=1;
//
//		while(i<n-1)
//		{
//
//			Node temp=q.remove();
//			Node left=new Node(10);
//			Node right=new Node(100);
//
//			if(arr[i].equals("")) left=null;
//			else
//			{
//				int l=Integer.parseInt(arr[i]);
//				left.val=l;
//				q.add(left);
//
//			}
//			if(arr[i+1].equals("")) right=null;
//			else
//			{
//				int r=Integer.parseInt(arr[i+1]);
//				right.val=r;
//				q.add(right);
//			}
//			temp.left=left;
//			temp.right=right;
//			i+=2;
//		}
//		return root;
//	}
//
//	public static void preOrder(Node root)
//	{
//		if(root==null) return;
//		System.out.print(root.val+" ");
//		preOrder(root.left);
//		preOrder(root.right);
//	}
//
//	public static void postOrder(Node root)
//	{
//		if(root==null) return;
//		postOrder(root.left);
//		postOrder(root.right);
//		System.out.print(root.val+" ");
//	}
//
//
//	public static void inOrder(Node root)
//	{
//		if(root==null) return;
//		inOrder(root.left);
//		System.out.print(root.val+" ");
//		inOrder(root.right);
//	}
//
//	public static void deleteChild(Node root,int target)
//	{
//		if(root==null) return;
//		if(target<root.val){
//			if(root.left==null)return;
//			if(root.left.val==target) root.left=null;
//			else deleteChild(root.left,target);
//		}else{
//			if(root.right==null)return;
//			if(root.right.val==target) root.right=null;
//			else deleteChild(root.right,target);
//		}
//	}
//	public static void deleteOneChild(Node root,int val)
//	{
//		if(root==null) return;
//		if(val<root.val)
//		{
//			if(root.left==null) return;
//			if(root.left.val==val)
//			{
//				if(root.left.left==null && root.left.right==null) root.left=null;
//				if(root.left.left==null || root.left.right==null)
//				{
//					if(root.left.left!=null) root.left=root.left.left;
//					else root.left=root.left.right;
//				}
//			}
//			else deleteOneChild(root.left,val);
//		}
//		else
//		{
//			if(root.right==null) return;
//			if(root.right.val==val){
//				if(root.right.right==null && root.right.left==null) root.right=null;
//				if(root.right.right==null || root.right.left==null)
//				{
//					if(root.right.right!=null) root.right=root.right.right;
//					else root.right=root.right.left;
//				}
//			}
//			else deleteOneChild(root.right,val);
//
//		}
//	}
//
//	public static void deleteNode(Node root,int val)
//	{
//		if(root==null) return;
//		if(val<root.val)
//		{
//			if(root.left==null) return;
//			if(root.left.val==val)
//			{
//				if(root.left.left==null && root.left.right==null) root.left=null;
//				else if(root.left.left==null || root.left.right==null)
//				{
//					if(root.left.left!=null) root.left=root.left.left;
//					else root.left=root.left.right;
//				}
//			}
//			else deleteNode(root.left,val);
//		}
//		else
//		{
//			if(root.right==null) return;
//			if(root.right.val==val){
//				if(root.right.right==null && root.right.left==null) root.right=null;
//				if(root.right.right==null || root.right.left==null)
//				{
//					if(root.right.right!=null) root.right=root.right.right;
//					else root.right=root.right.left;
//				}
//			}
//			else deleteNode(root.right,val);
//
//		}
//	}
//	public static void main(String args[]){
//		// System.out.println("Hello World");
//
//		String[] arr={"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
//		Node root=constructbfs(arr);
//		int level=height(root);
//
//		System.out.print("Pre-Order: ");
//		preOrder(root);
//		System.out.println();
//		// System.out.print("In-Order: ");
//		// inOrder(root);
//		// System.out.println();
//		// System.out.print("Post-Order: ");
//		// postOrder(root);
//		// System.out.println();
//
//		deleteOneChild(root,89);
//		System.out.print("Pre-Order: ");
//		preOrder(root);
//		System.out.println();
//	}
//}