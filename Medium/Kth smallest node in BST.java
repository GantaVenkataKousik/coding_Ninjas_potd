public class Solution {

    static void InOrder(TreeNode root,ArrayList<Integer> list){
        if(root == null)return ;

        InOrder(root.left,list);
        list.add(root.data);
        InOrder(root.right,list);
    }

    public static int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        InOrder(root,list);
        return list.get(k-1);
    }
}
