public class Solution
{
    public static Node reverseDLL(Node head)
    {
        Node curr = head , prev = null , next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
