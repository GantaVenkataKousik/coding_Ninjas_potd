public class Solution {

    static int peak(int arr[]){
        int s = 0,e=arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1])return mid;
            if(mid>s && arr[mid-1]>arr[mid])return mid-1;
            if(arr[s]<arr[mid])s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
    
    public static int findMin(int []arr) {
        int pk = peak(arr);
        if(pk==-1)return arr[0];
        return arr[pk+1];
    }
}
