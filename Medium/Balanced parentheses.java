import java.util.* ;
import java.io.*; 

public class Solution {

	private static void findAns(int n,List<String> ans,int left
	,int right,String par){
		if(left == n && right==n){
			ans.add(par);
			return ;
		}

		if(left<n){
			findAns(n,ans,left+1,right,par+'(');
		}
		if(right<left){
			findAns(n,ans,left,right+1,par+')');
		}
		return ;
	}


	public static List<String> balancedParantheses(int n) {
		List<String> ans = new ArrayList<>();
		findAns(n,ans,0,0,"");
		return ans;
	}
}
