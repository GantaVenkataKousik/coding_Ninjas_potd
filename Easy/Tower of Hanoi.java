import java.util.ArrayList;

public class Solution 
{

    public static void solve(ArrayList<ArrayList<Integer>> ans,int n,int from,int to,int aux){

        ArrayList<Integer> l = new ArrayList<>();
        if(n==1){
            l.add(from);
            l.add(to);
            ans.add(l);
            return ;
        }
        solve(ans,n-1,from,aux,to);
        l.add(from);
        l.add(to);
        ans.add(l);
        solve(ans,n-1,aux,to,from);
    }
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        solve(ans,n,1,2,3);
        return ans;
    }
}
