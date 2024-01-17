import java.util.* ;
import java.io.*; 
public class Solution {
	    public static int isSubsequence(String s1,String s2,String s3,int i,int j,int k,int dp[][]){
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(i == s1.length() && j == s2.length() && k == s3.length()){
            return 1;
        }
        int ans1 = 0, ans2 = 0;
        if(i <= s1.length() - 1){
            if(s1.charAt(i) == s3.charAt(k)){
              ans1 = isSubsequence(s1,s2,s3,i+1,j,k+1,dp);
            }
        }
        if(j <= s2.length() - 1){
            if(s2.charAt(j) == s3.charAt(k)){
              ans2 = isSubsequence(s1,s2,s3,i,j+1,k+1,dp);
            }
        }
        if(ans1 == 1 || ans2 == 1){
            dp[i][j] = 1;
        }else{
            dp[i][j] = 0;
        }
        return dp[i][j];
    }
	public static boolean isInterleave(String a, String b, String c) {
                       int n = a.length();
            int m = b.length();
            int l = c.length();
            if(n + m != l){
                return false;
            }
            int dp[][] = new int[n+1][m+1];
            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= m; j++){
                    dp[i][j] = -1;
                }
            }
            if(isSubsequence(a,b,c,0,0,0,dp) == 1){
                return true;
            }
            return false;
	}
}
