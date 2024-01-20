import java.util.* ;
import java.io.*; 
public class Solution {

	public static void rearrangeArray(int arr[], int n) {
		for(int i=0 ; i<n ; i++){
			arr[i] = arr[i] + (arr[arr[i]]%n*n);
		}
		for(int i=0 ; i<n ; i++){
			arr[i] /= n;
		}
		return ;

	}

}
