
public class Solution {

    static Node insert(int k, int val, Node head) {
        Node temp=head;
        while(temp!=null && k-1>0){
            temp = temp.next;
            k-=1;
        }
        if(temp==null)return  null;
        Node node = new Node(val);
        node.next= = temp.next;
        node.prev = temp.next.prev;
        temp.next.prev = node;
        temp.next = node;
        return head;

    }
}
