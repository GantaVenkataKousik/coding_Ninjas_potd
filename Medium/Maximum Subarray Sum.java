import java.util.*;

public class Main {

	static int maximumSumSubarray(int[] nums,int N){
        if (nums.length <= 0)
            return 0;
        
        int maxSum = nums[0];
        int currentSum = 0;
        
        for (int i: nums) {
            currentSum = Math.max(currentSum, 0);
            currentSum += i;
            
            maxSum = Math.max(maxSum, currentSum);
        }  

		if(maxSum == 0){
			maxSum = Integer.MIN_VALUE;
			for(int ele : nums){
				maxSum = Math.max(maxSum,ele);
			}
		}
        return maxSum;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr= new int[n];
		for(int i=0 ; i<n ; i++){
			arr[i] = in.nextInt();
		}

		int ans = maximumSumSubarray(arr,n);
		System.out.println(ans);

	}

}
