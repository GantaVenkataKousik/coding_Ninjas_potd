import java.util.* ;
import java.io.*; 

public class Solution {
	public static String[] printPatt(int n) {
		String[] ans = new String[n];
		String s = "";
		for(int i=0 ; i<n ; i++){
			s += "*";
			ans[n-i-1] = s;
		}

		return ans;
	}

}
