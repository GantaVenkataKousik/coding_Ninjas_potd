import java.util.* ;
import java.io.*; 
public class Solution 
{

    private static boolean isPalindrome(String str){
        int s = 0 , e = str.length()-1;
        
        while(s<e){
            if(str.charAt(s) != str.charAt(e))return false;
            s++;
            e--;
        }
        return true;
    }
    public static int countNumberOfPalindromeWords(String str) 
	{
        int n = str.length() , cnt = 0;
        if(n==0)return 0;
        StringBuilder s = new StringBuilder();
        for(int i=0 ; i<n ; i++){
            if(str.charAt(i)!=' '){
                s.append(str.charAt(i));
            }
            else{
                while(str.charAt(i)==' ')i++;
                i--;
                if(isPalindrome(s.toString().toLowerCase()))cnt++;
                s = new StringBuilder();
            }
        }
        if(isPalindrome(s.toString().toLowerCase()))cnt++;
        return cnt;
    }
}
