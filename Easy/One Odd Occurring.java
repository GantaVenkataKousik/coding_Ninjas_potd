public class Solution{
    public static int missingNumber(int n, int []arr){
        int xr = 0;
        for(int ele : arr){
            xr ^= ele;
        }
        return xr;
    }
}
