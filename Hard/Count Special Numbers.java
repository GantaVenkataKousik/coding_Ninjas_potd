import java.util.* ;
import java.io.*; 
public class Solution {
    public static int countSpecialNumbers(int n) {
        int cnt = 0;
        for(int i=1 ; i<=n ; i++){
            int val = i , rem = 0;
            while(val > 0){
                rem = val%10;
                if(rem<1 || rem>5)break;
                val /= 10;
            }
            if(val==0){
                cnt++;
            }
        }
        return cnt;
    }
}
