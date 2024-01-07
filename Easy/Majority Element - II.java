import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {

        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.size();
        Map<Integer,Integer> mp = new HashMap<>();
        for(int ele:arr){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()>(n/3)){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
