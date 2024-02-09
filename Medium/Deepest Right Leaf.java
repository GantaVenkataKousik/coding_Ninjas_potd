import java.util.* ;
import java.io.*; 
/*******************************************************
	Following is the BinaryTreeNode class structure

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
			left = null
			right = null
		}
	}
*******************************************************/

public class Solution {
	public static BinaryTreeNode<Integer> deepestRightLeaf(BinaryTreeNode<Integer> root) {
		if(root == null)return null;
		Queue<BinaryTreeNode> q = new LinkedList<>();

		q.offer(root);
		BinaryTreeNode<Integer> ans = null;
		while(!q.isEmpty()){
			BinaryTreeNode<Integer> node = q.poll();
			if(node.left!=null)q.offer(node.left);
			if(node.right!=null){
				q.offer(node.right);
				if(node.right.left==null && node.right.right==null)ans = node.right;
			}
		}
		return ans;
	}
}
