import java.util.* ;
import java.io.*; 
public class Solution {

	public static String findShortestPalindrome(String s) {
		        StringBuilder sb = new StringBuilder(s+"#"+new StringBuilder(s).reverse().toString());
        int i=0,j=1;
        
        int n = sb.length();
        int[] sp = new int[n];
        sp[0]=0;

        

        while(j<n){
            if(sb.charAt(i) == sb.charAt(j)){
                sp[j] = i+1;
                i++;
                j++;
            }
            else{
                if(i>0){
                    i = sp[i-1];
                }
                else{
                    j++;
                }
            }
            
        }
        
        return new StringBuilder(new StringBuilder(s.substring(sp[n-1])).reverse().toString()+s).toString();
	}

}
