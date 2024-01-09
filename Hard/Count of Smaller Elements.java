import java.util.*;
class Node{
    int val;
    int index;
    Node(int val,int index){
        this.val = val;
        this.index = index;
    }
}
public class Solution {

    public static void merge(Node nums[],int s,int mid,int e,List<Integer> ans){
        int n = e-s+1 , cnt = 0;
        Node aux[] = new Node[n];
        int k = 0 , i=s , j=mid+1;
        while(i<=mid && j<=e){
            if(nums[i].val>nums[j].val){
                cnt = e-j+1;
                ans.set(nums[i].index,ans.get(nums[i].index)+cnt);
                aux[k++] = nums[i++];
            }
            else{
                aux[k++] = nums[j++];
            }
        }
        while(i<=mid){
            aux[k++] = nums[i++];
        }
        while(j<=e){
            aux[k++] = nums[j++];
        }
        k=0;
        for( ; k<n ; k++){
            nums[k+s] = aux[k];
        }

    }

    public static void mergeSort(Node nums[],int s,int e,List<Integer> ans){
        if(s<e){
            int mid = s + (e-s)/2;
            mergeSort(nums,s,mid,ans);
            mergeSort(nums,mid+1,e,ans);
            merge(nums,s,mid,e,ans);
        }
    }
    public static int[] countNumber(int n, int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Node[] arr = new Node[n];
        for(int i=0 ; i<n  ; i++){
            ans.add(0);
            Node temp = new Node(nums[i],i);
            arr[i] = temp;
        }

        mergeSort(arr,0,n-1,ans);
        int a[] = new int[n];
        for(int i=0 ; i<n ; i++){
            a[i] = ans.get(i);
        }
        return a;
    } 
}
