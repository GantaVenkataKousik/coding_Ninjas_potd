import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findProductSumDifference(int n) {
        int sum = 0 , pro = 1;
        int r = -1;
        while(n>0){
            r = n % 10;
            sum += r;
            pro *= r;
            n /= 10;
        }
        return pro-sum;
    }
}
