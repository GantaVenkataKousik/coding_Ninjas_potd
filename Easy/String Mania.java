import java.util.* ;
import java.io.*; 
public class Solution {
	public static int stringMania(int n, int m, String str1, String str2) {
		int res = str1.compareTo(str2);
		if(res<0)return -1;
		if(res>0)return 1;
		return 0;
	}
}
