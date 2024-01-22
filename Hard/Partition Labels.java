import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] partitionLabels(String s){
       List<Integer> ans = new ArrayList<>();
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        int maxReach = -1, j = 0;

        for (int i = 0; i < s.length(); i++) {
            maxReach = Math.max(maxReach, last[s.charAt(i) - 'a']);

            if (i == maxReach) {
                ans.add(i - j + 1);
                j = i + 1;
            }
        }

        int res[] =  new int[ans.size()];
        for(int i=0 ; i<ans.size() ; i++){
            res[i] = ans.get(i);
        }
        return res;
 
    }
}
