import java.util.* ;
import java.io.*; 
/************************************************************

   Following is the TreeNode class structure:

   class TreeNode<T> {
    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;

    TreeNode(T data) {
      this.data = data;
      left = right = null;
    }
   };

************************************************************/


class Solution {

  public static int levelLeaf(TreeNode root) {
    
    Queue<TreeNode> q  = new LinkedList<>();
    List<Integer> list = new ArrayList<>();
    q.add(root);
    int level = 1;
    while(!q.isEmpty()){
        int n = q.size();
        level++;

        for(int i=0 ; i<n ; i++){
          TreeNode node = q.poll();
          if(node.left==null && node.right==null){
            list.add(level);
            continue;
          }
          if(node.left!=null){
            q.add(node.left);
          }
          if(node.right!=null){
            q.add(node.right);
          }
        }

    }
    for(int i=0 ; i<list.size()-1 ; i++){
      if(list.get(i)!=list.get(i+1))return 0;
    }
    return 1;
  }
}
