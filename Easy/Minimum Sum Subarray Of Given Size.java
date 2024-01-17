import java.util.* ;
import java.io.*; 
public class Solution
{
public static int minSubarraySum(ArrayList<Integer> arr, int n, int k)
    {
       int minSum = arr.get(0) , sum = 0;
       int i=0;
       for( ; i<k ; i++){
           sum += arr.get(i);
          
       }   
       minSum = sum;
       while(i<n){
           sum += arr.get(i);
           sum -= arr.get(i-k);
           minSum = Math.min(minSum,sum);
           i++;
       }
       return minSum;
       
    }
}
