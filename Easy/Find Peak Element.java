import java.util.ArrayList;
public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size();
        for(int i=0 ; i<n ; i++){
            if(i==0){
                if(arr.get(0)>arr.get(1))return 0;
                continue;
            }
            if(i==n-1){
                if(arr.get(n-1)>arr.get(n-2))return n-1;
                continue;
            }
            if(arr.get(i)>arr.get(i-1) && arr.get(i)>arr.get(i+1))return i;
        }
        return -1;
    }
};
