import java.util.Stack;

public class CQueue
{
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size = 0;
    public CQueue()
    {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void append_Tail(int x)
    {
        stack1.push(x);
        size++;
    }

    public int deleteHead()
    {
        if(size == 0) return -1;
        if(stack2.empty())
        {
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        size--;
        return stack2.pop();
    }

    public static void main(String[] args)
    {
        CQueue cQueue = new CQueue();
        cQueue.append_Tail(1);
        cQueue.append_Tail(2);
        cQueue.append_Tail(5);
        System.out.println(cQueue.deleteHead());
    }
}
