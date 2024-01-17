import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> divideString(String word, int n) {
        ArrayList<String> ans = new ArrayList<>();
        
        int len = word.length();
        if(len%n != 0)return ans;

        int i=0,equalLen = len/n;
        while(i<len){
            ans.add(word.substring(i,i+equalLen));
            i+=equalLen;
        }
        return ans;
    }
}
