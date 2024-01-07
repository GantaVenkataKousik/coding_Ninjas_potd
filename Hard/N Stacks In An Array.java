import java.util.* ;
import java.io.*; 
public class NStack {
    // Initialize your data structure.
    Stack<Integer> [] stacks;
    int size;
    public NStack(int N, int S) {
        size = S;
        stacks = new Stack[size];
        for(int i=0 ; i<size ; i++){
            stacks[i] = new Stack<>();
        }

    }

    // Pushes 'X' into the Mth stack. Returns true if it gets pushed into the stack, and false otherwise.
    public boolean push(int x, int m) {
        if(stacks[m].size()>size)return false;
        stacks[m].push(x);
        return true;
    }

    // Pops top element from Mth Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
    public int pop(int m) {
        if(stacks[m].isEmpty())return -1;
        return stacks[m].pop();
    }
}
