import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static boolean matrixGame(ArrayList<ArrayList<Integer>> arr) {

		int n = arr.size();
		int[][] result = new int[n][n];
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<n ; j++){
				int sum  =0;
				for(int k=0 ; k<n  ; k++){
					sum += arr.get(i).get(k)*arr.get(k).get(j);
				}
				result[i][j] = sum;
			}
		}

		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<n ; j++){
				if(arr.get(i).get(j) != result[i][j])return false;
			}
		}
		return true;
	}
}
