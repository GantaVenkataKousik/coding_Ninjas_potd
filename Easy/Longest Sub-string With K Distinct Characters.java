import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLengthofLongestSubstring(String s, int k) {
		int i=0 , j =0  , n = s.length();
		Map<Character,Integer> mp = new HashMap<>();
		int maxLen = Integer.MIN_VALUE;

		char ch,ch2;
		while(i<n){
			ch = s.charAt(i);
			mp.put(ch, mp.containsKey(ch) ? mp.get(ch) + 1 : 1);

			if(mp.size() == k){
				maxLen = Math.max(maxLen,i-j+1);
			}
				while(mp.size()>k){
					ch2 = s.charAt(j++);
					int val=   mp.get(ch2) - 1; 
					if( val == 0)mp.remove(ch2);
					else mp.put(ch2,val);
				}
			i++;
		}
		maxLen = Math.max(maxLen,i-j);
		return maxLen;
	}
}
