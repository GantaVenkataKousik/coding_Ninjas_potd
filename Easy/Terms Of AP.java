import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] termsOfAP(int x){
		int[] ans = new int[x];
		int i=1 , k = 0;
		while(x>0){
			if((3*i + 2) % 4 != 0){
				ans[k++] = (3*i + 2);
				x--; 
			}
			i++;
		}
		return ans;
	}
}
