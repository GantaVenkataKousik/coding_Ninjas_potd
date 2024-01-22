import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[][] getFinalGrid(int a[][], int n) {
        // Write your code here.
        int mid=  n/2;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<mid ; j++){
                int temp = a[i][j];
                a[i][j] = a[i][n-j-1];
                a[i][n-j-1] = temp;
                // a[i][j] = (a[i][j]==1)?0:1;
                // a[i][n-i-1]=(a[i][n-j-1]==1)?0:1;
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                a[i][j] = (a[i][j]==1)?0:1;
            }
        }
        return a;
    }
}
