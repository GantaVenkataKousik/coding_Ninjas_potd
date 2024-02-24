import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) {
		int cnt = 0;
		while(n>0){
			if(n%2!=0)cnt++;
			n = n/2;
		}
		return cnt;
	}
}
