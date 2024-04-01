import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int missingNumber(int[] arr, int n) 
    {
        Map<Integer,Integer> mp = new HashMap<>();
        
        int diff1=-1 ; 
        int diff2 = -1;
        int cnt1 = 0 , cnt2 = 0;
        int diff = -1;
        for(int i=1 ; i<n  ; i++){
            diff = arr[i]-arr[i-1];
            if(diff1==-1){
                diff1 = diff;
                cnt1= 1;
            }
            else if(diff1 == diff)cnt1++;
            else if(diff2 == -1){
                diff2 = diff;
                cnt2=1;
            }
            else cnt2++;
        }

        int cd = -1;
        if(cnt1>=cnt2){
            cd = diff1;
        }
        else{
            cd = diff2;
        }

        for(int i=1 ; i<n  ;i++){
            diff = arr[i] - arr[i-1];
            if(diff != cd){
                return (arr[i]+arr[i-1])/2;
            }
        }

        return 0;
    }
}

