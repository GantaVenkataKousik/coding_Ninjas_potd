import java.util.* ;
import java.io.*; 
/******************************************************
   
    Following is the LinkedListNode class for the Singly Linked List

    class LinkedListNode {
        int data;
        LinkedListNode next;

        LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

****************************************************/

public class Solution {

    private static LinkedListNode reverseLL(LinkedListNode head){
        LinkedListNode curr = head, next  = null , prev = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static LinkedListNode addTwoLL(LinkedListNode first,
    LinkedListNode second){

        first = reverseLL(first);
        second = reverseLL(second);

        LinkedListNode dummy = new LinkedListNode(-1);
        LinkedListNode tail  =dummy;

        int carry = 0 , sum = 0;
        
        while(first!=null || second!=null || carry!=0){
            if(first!=null){
                sum += first.data;
                first = first.next;
            }
            if(second!=null){
                sum += second.data;
                second = second.next;
            }
            if(carry!=0)sum += 1;

            tail.next = new LinkedListNode(sum%10);
            tail = tail.next;

            carry = sum/10;
            sum = 0;
        }

        return reverseLL(dummy.next);
    }   
    public static LinkedListNode addFirstAndReversedSecondHalf(LinkedListNode head) {
        LinkedListNode slow =head , fast = head;
        if(head==null || head.next == null)return head;
        if(head.next.next == null){
            slow = head;
        }
        else{
            while(fast!=null && fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
        }

        LinkedListNode second = slow.next;
        slow.next = null;
        LinkedListNode first = head;

        LinkedListNode ans = addTwoLL(first,second);
        int cnt = 0 ;
        for(LinkedListNode temp = ans ; temp!=null && temp.data == 0; temp = temp.next)cnt++;
        if(cnt>1){
            while(ans.next!=null && ans.data ==0)ans = ans.next;
        }
        return ans;

    }

}
