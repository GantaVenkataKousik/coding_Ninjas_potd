import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int boringFactorials(int n, int p)
    {
        int pro = 1;
        for(int i= 2 ; i<=n  ; i++){
            pro = (pro%p * (i%p))%p;
        }
        return pro;
    }
}
