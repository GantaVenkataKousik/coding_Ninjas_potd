import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static Queue<Integer> reverseElements(Queue<Integer> q, int k) 
  {
    Stack<Integer> st = new Stack<>();
    int rem = q.size()-k;
    while(k-->0){
      st.push(q.poll());
    }
    while(!st.isEmpty()){
      q.add(st.pop());
    }
    while(rem-- >0){
      q.add(q.poll());
    }
    return q;
    
  }
}
