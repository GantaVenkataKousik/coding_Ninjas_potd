import java.util.* ;
import java.io.*; 
/*****************************************
Following is the BinaryTreeNode structure

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

******************************************/

public class Solution {

    public static BinaryTreeNode<Integer> removeNode(BinaryTreeNode<Integer> root, int data) {
        /* Your class should be named Solution
        * Don't write main().
        * Don't read input, they are passed as function arguments.
        * Return output and don't print it.
        * Taking input and printing output is handled automatically.
        */
        if(root==null)return null;
        else if(root.data < data){
            root.right = removeNode(root.right,data);
        }
        else if(root.data>data){
            root.left = removeNode(root.left,data);
        }
        else{
            if(root.left==null && root.right==null)return null;
            if(root.left==null && root.right!=null)return root.right;
            if(root.right==null && root.left!=null)return root.left;
            BinaryTreeNode<Integer> rightMost = root.right;
            while(rightMost.left!=null)rightMost = rightMost.left;
            root.data=rightMost.data;
            root.right = removeNode(root.right,rightMost.data);
            return root;
        }
        return root;
    }
}
