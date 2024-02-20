import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class ListNode<T> {
 
		public T data;
		public ListNode<T> next;

		public ListNode(T data) {
			this.data = data;
		}
	}

************************************************************/

public class Solution {
	  static ListNode<Integer> reverseLL(ListNode<Integer> head2){
        
        ListNode<Integer> prev=null,next=null,curr=head2;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

	public static ListNode<Integer> addTwoLists(ListNode<Integer> first, ListNode<Integer> second) {
		if(first==null && second ==null)return  null;
        ListNode<Integer> head,tail;
        
        first = reverseLL(first);
        second = reverseLL(second);
        
        int digit = 0,carry = 0;
        int sum= 0;
        ListNode<Integer> dummy = new ListNode<Integer>(-1);
        ListNode<Integer> temp=dummy;
        while(first!=null || second!=null){
            int x = (first!=null)?first.data:0;
            int y = (second!=null)?second.data:0;
            sum = x+y+carry;
            digit = sum%10;
            carry = sum / 10;
            temp.next = new ListNode<Integer>(digit);
            temp = temp.next;
            if(first!=null)first = first.next;
            if(second!=null)second = second.next;
        }
        if(carry!=0){
            temp.next = new ListNode<Integer>(carry);
        }
        return reverseLL(dummy.next);
        // if(flag == 1)head1 = head1.next;
        
	}
}
