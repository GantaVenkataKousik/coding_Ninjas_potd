import java.util.* ;
import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node insert(Node head, int n, int pos, int val) {
       Node node = new Node(val);
       if(head==null)return node;
       Node temp = head;
       if(pos == 0){
           node.next=head;
           head=node;
           return head;
       }
       for(int i=1 ; i<pos && temp.next!=null ; i++){
           temp = temp.next;
       }
        if(temp.next==null){
            temp.next = node;
            return head;
        }

        node.next = temp.next;
        temp.next = node;
        return head;
    }
}
