import java.util.* ;
import java.io.*; 
public class Solution {
	public static int goodnessOfString(String s) {
		int depth = 0 , sum = 0 , n = s.length();
		char ch;
		for(int i=0 ; i<n ; i++){
			ch = s.charAt(i);
			if(ch=='['){
				depth++;
			}
			else if(ch==']'){
				depth--;
			}
			else{
				if(ch==',' || ch==' ')continue;
				else{
					String str = "";
					while(i<n && s.charAt(i)!=',' &&  s.charAt(i)!='[' && 
					 s.charAt(i)!=']' && s.charAt(i)!=' '){
						str += s.charAt(i);
						i++;
					}
					sum += (Integer.parseInt(str)*depth);
					i--;
				}
			}
		}
		return sum;
	
	}
}
