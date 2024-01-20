import java.util.* ;
import java.io.*; 

public class Solution {
    public static int minimumCostTreeFromLeafNodes(ArrayList<Integer> arr){

        int ans = 0;

        Stack<Integer> st = new Stack<>();
         st.push(Integer.MAX_VALUE);

        for (int x : arr) {
            
            while (st.peek() <= x) {
                int temp = st.pop();
                ans += temp * Math.min(st.peek(), x);
            }
            st.push(x);
        }
        while (st.size() > 2) {
            int temp = st.pop();
            ans += (temp * st.peek());
        }
        return ans;
    }
}
