import java.util.* ;
import java.io.*; 
public class Solution {

    private static long GCD(long a,long b){
        if(b==0)return a;
        return GCD(b,a%b);
    }

    private static long LCM(long a,long b){
        return (a*b)/GCD(a,b);
    }

    public static long[] addFraction(int a, int b, int c, int d) {
        long[] ans = new long[2];
        long lcm = LCM(b,d);
        long num = a*(lcm/b) + c*(lcm/d);
    
        long gcd = GCD(num,lcm);

        ans[0] = num/gcd;
        ans[1] = lcm/gcd;
    
        return ans;
    }

}
