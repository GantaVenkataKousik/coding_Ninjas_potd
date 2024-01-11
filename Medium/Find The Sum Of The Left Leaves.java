
public class Solution {

	private static int Sum = 0;

	private static void Helper(TreeNode<Integer> root,int branch){
		if(root == null)return ;
		if(root.left == null && root.right==null){
			if(branch == 0)Sum += root.data;
			return ;
		}
		Helper(root.left,0);
		Helper(root.right,1);

	}

    public static int sumOfLeftLeaves(TreeNode<Integer> root) {
        Helper(root.left,0);
		Helper(root.right,1);
		int res = Sum;
		Sum = 0;
		return res;
    }
}
