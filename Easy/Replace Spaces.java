import java.util.* ;
import java.io.*; 
public class Solution {
	public static StringBuilder replaceSpaces(StringBuilder str) {
		StringBuilder ans = new StringBuilder();
		int  n = str.length();
		for(int i=0 ; i<n ;  i++){
			if(str.charAt(i)==' '){
				ans.append("@40");
			}
			else{
				ans.append(str.charAt(i));
			}
		}
		return ans;
	}
}
