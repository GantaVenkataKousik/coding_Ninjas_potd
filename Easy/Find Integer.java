import java.util.* ;
import java.io.*; 

public class Solution {
	public static int findInteger(int n, int k) {
		int cnt = 0;
		for(int i=1 ; i<=n ; i+=2){
			cnt++;
			if(cnt==k)return i;
			
		}
		for(int i=2 ; i<=n ; i+=2 ){
			cnt++;
			if(cnt==k)return i;
			
		}
		return -1;
	}

}
