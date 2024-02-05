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

        if(pos==0){
            node.next = head;
            head = node;
        }
        else if(pos == n){
            Node temp = head;
            while(temp.next!=null)temp = temp.next;
            temp.next = node;
        }
        else{
            Node temp = head;
            pos--;
            while(pos-->0){
                temp = temp.next;
            }

            node.next = temp.next;
            temp.next = node;
        }
        return head;


    }
}
