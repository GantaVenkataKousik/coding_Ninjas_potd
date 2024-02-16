import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
        private static int countPairs(int[] arr,int l,int m,int h){
        int cnt = 0;
        int t = l, k = 0 ;
        for(int j = m + 1; j <= h; j++) {
            while(t <= m && arr[t] <= 2L *arr[j]) t++;
            cnt += m - t + 1;
        }
        return cnt;
    }
    
    private static int mergeSort(int[] arr,int start,int end){
	    int cnt = 0;
        if(start>=end)return cnt;
	    int mid = start +  (end-start)/2;
	    //divide the array into two sub parts
	    //left sub part with out knowing mid it is not possible
	    cnt += mergeSort(arr,start,mid);
	    cnt += mergeSort(arr,mid+1,end);
	    cnt += countPairs(arr,start,mid,end);
        
	    //merging the two halves into a sorted manner
	    merge(arr,start,mid,end);
        return cnt;
	}
    
    
    private static void merge(int arr[], int start, int mid, int end) {
        int left[] = new int[mid - start + 1];
        int right[] = new int[end - mid];
        int k = 0;
        for (int i = start; i <= mid; i++) {
            left[k++] = arr[i];
        }
        k = 0;
        for (int i = mid + 1; i <=end; i++) {
            right[k++] = arr[i];
        }
        int mainIdx = start;

        int i=0,j=0;
        //merging two sorted arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[mainIdx++] = left[i++];
            } else {
                arr[mainIdx++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[mainIdx++] = left[i++];
        }
        while (j < right.length) {
            arr[mainIdx++] = right[j++];
        }
    }
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        int nums[] = new int[arr.size()];
        for(int i=0 ; i<arr.size() ; i++){
            nums[i] = arr.get(i);
        }
        int cnt  = mergeSort(nums,0,nums.length-1);
        return cnt;
    }
}
