import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findIndexOf(String A, String B) {
        int n = B.length();
        int m = A.length();

        if (m > n) {
            return -1;
        }

        int[] lps = new int[m];
        lps[0] = 0;
        int len = 0;

        for (int i = 1; i < m; ) {
            if (A.charAt(i) == A.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int i = 0; // Index for string B
        int j = 0; // Index for string A

        while (i < n) {
            if (A.charAt(j) == B.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                return i - j;
            } else if (i < n && A.charAt(j) != B.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1;
    }
}
