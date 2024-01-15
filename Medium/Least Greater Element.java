import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] leastGreaterElement(int[] arr) {
        // Write your code here
        TreeSet<Integer> st = new TreeSet<>();
        int[] ans = new int[arr.length];
        for(int i = arr.length - 1 ; i>=0 ; i--){
            st.add(arr[i]);
            Integer lge = st.higher(arr[i]);
            if(lge == null){
                ans[i] = -1;
            }
            else{
                ans[i] = lge;
            }
        }
        return ans;
    }
}
