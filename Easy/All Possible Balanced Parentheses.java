import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution
{
	private static void generate(ArrayList<String> ans,int openLen,int closeLen,String comb,int n){
        
        if(openLen==n  && closeLen == n){
            ans.add(comb);
        }
        if(openLen < n){
            generate(ans,openLen+1,closeLen,comb+"(",n);
        }
        //Now I need to balance the open parentheses
        //so i need ti close them if the 
        //count of close parentehses is less than open parentheses
        if(closeLen<openLen){
            generate(ans,openLen,closeLen+1,comb+")",n);
        }
        
    }
    
	public static ArrayList<String> balancedParentheses(int n)
	{
		ArrayList<String> ans =  new ArrayList<>();
        generate(ans,0,0,"",n);
        return ans;
	}
}
