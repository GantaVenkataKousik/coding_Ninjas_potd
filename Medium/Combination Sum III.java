import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    static void combinations(int k,int n,int sum,int idx,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
        
        if(k==0){
            if(sum==n){
                ans.add(temp);
            }
            return ;
        }
        
        for(int i=idx ; i<10 ; i++){
            ArrayList<Integer> t = new ArrayList<>(temp);
            t.add(i);
            if(sum+i<=n){
                combinations(k-1,n,sum+i,i+1,t,ans);
            }
            else{
                return ;
            }
        }
    
    }

    static ArrayList<ArrayList<Integer>> combinationSum3(int k, int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        combinations(k,n,0,1,temp,ans);
        return ans;
    }
}
