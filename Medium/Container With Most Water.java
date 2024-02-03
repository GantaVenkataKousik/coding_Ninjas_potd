public class Solution {

	public static int maxArea(int[] height) {
	    int maxA = Integer.MIN_VALUE;
		int lh = 0 , rh = 0 , l = 0 , r = height.length-1;
		while(l<r){
			lh = height[l];
			rh = height[r];
			maxA = Math.max(maxA,Math.min(lh,rh)*(r-l));
			if(lh<=rh)l++;
			else r--;
		}
		return maxA;
		
	}
}
