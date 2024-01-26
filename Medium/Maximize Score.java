import java.util.*;
public class Solution {
	public static int maximizeScore(ArrayList<Integer> arr, int n, int k) {
		if(k==n){
			int sum = 0;
			for(int ele : arr){
				sum += ele;
			}
			return sum;
		}

		if(k==0)return 0;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int ele:arr){
			pq.add(ele);
		}
		int score = 0;
		while(!pq.isEmpty() && k>0){
			score += pq.poll();
			k--;
		}
		return score;
	}
}

