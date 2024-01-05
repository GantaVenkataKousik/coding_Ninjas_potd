import java.util.* ;
import java.io.*; 
public class Solution {
    public static String doorStatus(int N) {
        int[] ans = new int[N];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int sq = i * i;
            if (sq <= N) {
                list.add(sq);
            } else {
                break;
            }
        }
        for (int i : list) {
            ans[i - 1] = 1;
        }

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]);
            if (i != N - 1) {
                sb.append("");
            }
        }

        return sb.toString();
    }
}
