public class Solution {
	
        private static boolean isWildCard(String s1,String s2,int i,int j,int[][] dp){
        if(i<0 && j<0)return true;
        if(i<0 && j>=0)return false;
        if(j<0 && i>=0){
            boolean flag = true;                     
            for(int k=i ; k>=0 ; k--){
                if(s1.charAt(k)!='*')return false;
            }
            return flag;
        }
        
        if(dp[i][j]!=-1){
            return (dp[i][j] == 1)?true:false;
        }
        
        if(s1.charAt(i) == s2.charAt(j) || s1.charAt(i)=='?'){
            boolean val = isWildCard(s1,s2,i-1,j-1,dp);
            dp[i][j] = (val)?1:0;
            return val;
        }
        
        if(s1.charAt(i) == '*'){
            boolean val = isWildCard(s1,s2,i-1,j,dp) || isWildCard(s1,s2,i,j-1,dp);
            dp[i][j] = (val)?1:0;
            return val;
        } 
        
        dp[i][j] = 0;
        return false;
        
    }
	public static boolean wildcardMatching(String p, String s) {
		        int n1 = p.length() , n2 = s.length();
        int[][] dp = new int[n1][n2];
        for(int i=0 ; i<n1  ; i++){
            for(int j=0 ; j<n2  ; j++){
                dp[i][j] = -1;
            }
        }
        return (isWildCard(p,s,n1-1,n2-1,dp));
	}
}
