public class Solution {

	private static int square(int n){
		
		int sq = 0,r=0;
		while(n>0){
			r = (n%10);
			sq += (r*r);
			n /= 10;
		}
		return sq;
	}
	public static boolean isGoodNumber(int n) {
		if(n==1)return true;
		int slow = n , fast = n;
		do{
			slow = square(slow);
			fast = square(square(fast));
		}while(slow!=fast && fast!=1);
		return fast==1;
	}
}
