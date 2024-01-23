import java.util.* ;
import java.io.*; 
public class Solution {

    public static int maximumWeightRow(int n, int m, int[][] mat) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            int sum  =0;
            for(int j=0 ; j<m ; j++){
                sum += mat[i][j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
