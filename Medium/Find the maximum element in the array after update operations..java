import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int findMaxElement(ArrayList < ArrayList < Integer >> arr, int n, int m) {
        int[] a = new int[n];
        for(int i=0 ; i<m ; i++){
            int s = arr.get(i).get(0);
            int e = arr.get(i).get(1);

            for(int j=s-1 ; j<e ; j++){
                a[j] += 1;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            max = Math.max(a[i],max);
        }
        return max;
    }
}
