import java.util.* ;
import java.io.*; 
public class Solution {

    public static int beautifulIndex(int N, int[] A)
    {
        int totalSum = 0;
        for(int ele : A)totalSum+=ele;
        int leftSum = 0;
        for(int i=0; i<N ; i++){
            totalSum -= A[i];
            if(leftSum == totalSum)return i+1;
            leftSum += A[i];
        }
        return -1;
    }
}
