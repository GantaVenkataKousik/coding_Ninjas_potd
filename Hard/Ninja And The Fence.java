import java.util.* ;
import java.io.*; 
public class Solution {
	static int m = (int)(1e9+7);
	public static int numberOfWays(int n, int k) {
		// Write your code here.
		if(n==1)return k;
		if(n==2)return k+(k*(k-1))%m;

		int[] ways = new int[n+1];
		ways[1] = k;
		ways[2] = k+(k*(k-1))%m;

		for(int i=3 ; i<=n ; i++){
			ways[i] = ((ways[i-1]+ways[i-2])*(k-1))%m;
		}
		
		return ways[n];
	}
}
