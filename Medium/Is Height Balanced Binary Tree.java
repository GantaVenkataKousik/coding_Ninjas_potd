 *************************************************************/
class Height{
    int height = 0;
}



public class Solution {

    private static boolean check(TreeNode<Integer> root,Height height){
        if(root==null){
            height.height = 0;
            return true;
        }

        Height lefth = new Height();
        Height righth = new Height();

        boolean l = check(root.left,lefth);
        boolean r = check(root.right,righth);

        int lh = lefth.height , rh = righth.height;

        height.height = ((lh > rh)?lh:rh)+1;

        if(Math.abs(leftHeightVal - rightHeightVal) > 1)return false;
        return l&&r;
    }

    public static boolean isBalancedBT(TreeNode<Integer> root) {
        Height height = new Height();
        return check(root,height);
    }
}
