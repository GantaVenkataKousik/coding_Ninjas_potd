/*******************************************************

	Following is the BinaryTreeNode class structure:

	class BinaryTreeNode<T> {
    	T data;
    	BinaryTreeNode<T> left;
    	BinaryTreeNode<T> right;

    	public BinaryTreeNode(T data) {
        	this.data = data;
    	}
	}
	
*******************************************************/
import java.util.*;
public class Solution {

	private static void inOrder(BinaryTreeNode<Integer> root,List<BinaryTreeNode<Integer>> list){
		if(root==null)return ;
		inOrder(root.left,list);
		list.add(root);
		inOrder(root.right,list);		
	}
	public static BinaryTreeNode<Integer> inorderSuccesor(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> node) {
		List<BinaryTreeNode<Integer>> list = new ArrayList<>();
		inOrder(root,list);
		BinaryTreeNode<Integer> ans =null;
		for(int i=0 ; i<list.size() ; i++){
			if(list.get(i).data == node.data){
				if(i==list.size()-1)return null;
				ans = list.get(i+1);
				break;
			}
		}
		if(ans == null)return null;
		return ans;
	}
}
